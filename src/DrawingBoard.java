/*
    Introduction to OOP with Java 4th Ed, McGraw-Hill

    Wu/Otani

    Chapter 5 The DrawingBoard class

    File: DrawingBoard.java

*/

import java.awt.*;
import javax.swing.*;
import java.util.*;

/**
 * This window simulates a screensaver by drawing shapes. To use this class you must
 * define a class named Shape and provide the following methods:
 * <li>
 * public void            setBackground(java.awt.Color)
 * public void            setCenterPoint(java.util.Point)
 * public java.util.Point getCenterPoint()
 * public void            draw(java.awt.Graphics)
 *
 * @author Dr. Caffeine
 */
public class DrawingBoard extends JFrame implements Runnable
{

//----------------------------------
//    Data Members:
//----------------------------------

    /**
     * Constant for drawing of shapes in smooth continuous movement
     */
    public static final int SMOOTH = 0;

    /**
     * Constant for drawing shapes at random locations
     */
    public static final int RANDOM = 1;

    /**
     * Constant for drawing shapes at fixed, stationary positions
     */
    public static final int STATIONARY = 2;

    /**
     * Constant for delay time (in seconds) between drawing
     */
    private static final double DEFAULT_DELAY_TIME = 0.15;

    /**
     * Constant for default background color
     */
    private static final Color DEFAULT_BACKGROUND = Color.black;

    /**
     * List to remember the shapes for drawing
     */
    private java.util.List shapeList;

    /**
     * List of (deltaX,deltaY) pairs represented as Point
     */
    private java.util.List offsetList;

    /**
     * Delay time (in seconds) between drawing
     */
    private double      delayTime;

    /**
     * Type of drawing -- SMOOTH, RANDOM, or STATIONARY
     */
    private int         drawingType;

    /**
     * Size of this window
     */
    private Dimension   windowSize;

    /**
     * Border size of this frame
     */
    private Insets      inset;

    /**
     * An Image used for double-buffering.
     */
    private Image       offScreenImage;

    /**
     * A Graphics object associated to the offscreen Image used for double-buffering.
     */
    private Graphics    offScreenGraphics;

    /**
     * Background color
     */
    private Color       bkcolor;


//-----------------------------------------
//
//    Constructors:
//
//-----------------------------------------

    /**
     * Default Constructor.
     *
     */
    public DrawingBoard( ) {
        this(DEFAULT_DELAY_TIME, STATIONARY);
    }

    /**
     * Sets the delay time to the given parameter.
     *
     * @param delayTime delay time between drawings
     * @param type      drawing type -- SMOOTH, RANDOM, STATIONARY
     */
    public DrawingBoard(double delayTime, int type) {

        this.delayTime   = delayTime;
        this.drawingType = type;

        shapeList = new ArrayList();

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        windowSize      = toolkit.getScreenSize();
        setBounds(0, 0, windowSize.width, windowSize.height);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        bkcolor = DEFAULT_BACKGROUND;
    }


//-------------------------------------------------
//      Public Methods:
//
//           public void  addShape(DrawableShape)
//           public void  draw(Graphics)
//
//           public void  setBackground(Color)
//           public void  setDelayTime(double)
//           public void  setMovement(int)
//           public void  setVisible(boolean)
//
//           public void  paint(Graphics)
//           public void  run( )
//           public void  start( )
//
//           public Point getCenterPoint()
//
//
//------------------------------------------------


    /**
     * Adds the shape to be drawn on this drawing board
     *
     * @param shape the shape to be drawn
     */
    public void addShape(DrawableShape shape) {

        shapeList.add(shape);

        //assign a random point as the shape's center point
        //if one is not defined yet
        Point pt = shape.getCenterPoint();
        if (pt == null) {
            Dimension dim = shape.getDimension();

            int xMargin = (int) Math.round(dim.width / 2);
            int yMargin = (int) Math.round(dim.height / 2);

            pt = new Point(getRandom(xMargin, windowSize.width  - xMargin),
                           getRandom(yMargin, windowSize.height - yMargin));

            shape.setCenterPoint(pt);
        }
    }


    /**
     * Sets the background color.
     *
     * @param background background color
     */
    public void setBackground(Color background) {
        super.setBackground(background);
        bkcolor = background;
    }


    /**
     * Sets the delay time between the drawings.
     *
     * @param delayTime the delay time
     */
    public void setDelayTime(double delayTime) {

        if (delayTime < 0) delayTime = -delayTime;

        this.delayTime = delayTime;
    }

    /**
     * Sets the drawing type. Invalid parameter will
     * be ignored causing no changes.
     *
     * @param drawingType the drawing type
     */
    public void setMovement(int drawingType) {

        if (SMOOTH <= drawingType && drawingType <= STATIONARY) {
            this.drawingType = drawingType;
        }
    }

    /**
     * Overrides the inherited setVisible to make
     * this frame appear on the screen as maximized and
     * with the black background.
     *
     * @param state true for visible; false for invisible
     */
    public void setVisible(boolean state) {

        super.setVisible(state);
        inset  = getInsets();

        offScreenImage    = createImage(windowSize.width, windowSize.height);
        offScreenGraphics = offScreenImage.getGraphics();

        repaint();
    }


    /**
     * Paint the contents by asking shapes to draw themselves
     *
     * @param Graphics the graphics object to draw lines
     */
    public void paint( Graphics g ) {

        if (offScreenGraphics != null) {

            offScreenGraphics.setColor(bkcolor);
            offScreenGraphics.fillRect( 0, 0,
                                         windowSize.width,
                                         windowSize.height );

            switch (drawingType) {

                case SMOOTH:     smoothDrawing(offScreenGraphics);
                                 break;

                case RANDOM:     randomDrawing(offScreenGraphics);
                                 break;

                case STATIONARY: stationaryDrawing(offScreenGraphics);
                                 break;
            }

            g.drawImage ( offScreenImage, 0, 0, this );
        }
    }


    /**
     * Implements the Runnable interface.
     */
    public void run( ) {

        while (true) {

            try {
                Thread.sleep((long)(delayTime * 1000));

            } catch (Exception e) { }

            repaint( );
        }
    }


    /**
     * Starts the drawing
     */
    public void start( ) {

        if (!isVisible()) {
            this.setVisible(true);
        }

        Thread thread = new Thread(this);

        thread.start();
    }


//-------------------------------------------------
//      Private Methods:
//
//           public void  createOffsetList( )
//           public int   getRandom(int, int)
//
//           public void  randomDrawing(Graphics)
//           public void  smoothDrawing(Graphics)
//           public void  stationaryDrawing(Graphics)
//
//------------------------------------------------


    /**
     * Creates the offset list of (deltaX,deltaY).
     */
    private void createOffsetList( ) {

        if (offsetList == null) {

            offsetList = new ArrayList();

            for (int i = 0; i < shapeList.size(); i++) {

                Point pt = new Point(getRandom(10, 20),
                                     getRandom(10, 20));

                pt.x *= Math.round(Math.random()) == 0 ? 1 : -1;
                pt.y *= Math.round(Math.random()) == 0 ? 1 : -1;

                offsetList.add(pt);
            }
        }
    }

    /**
     * Returns a random number between
     * the passed parameters min and max.
     *
     * @param min the lower bound of the random number
     * @param max the upper bound of the random number
     */
    private int getRandom(int min, int max) {

        double temp = Math.random() * (max - min + 1);
        return (int) Math.floor(temp) + min;
    }


    /**
     * Draws the shapes at random locations
     *
     * @param Graphics the graphics context
     */
    private void randomDrawing(Graphics g) {

        Iterator itr = shapeList.iterator();

        while (itr.hasNext()) {

            DrawableShape s = (DrawableShape) itr.next();

            s.draw(g);

            Dimension dim = s.getDimension();
            int xMargin = dim.width / 2;
            int yMargin = dim.height / 2;

            //update the center point for next drawing
            s.setCenterPoint(
                new Point(getRandom(xMargin, windowSize.width - xMargin),
                          getRandom(yMargin, windowSize.height- yMargin))
                             );
        }

    }

    /**
     * Draws the shapes at continuous locations
     *
     * @param Graphics the graphics context
     */
    private void smoothDrawing(Graphics g) {

        int tempX, tempY;

        createOffsetList( );

        Iterator itr  = shapeList.iterator();
        Iterator oItr = offsetList.iterator();

        while (itr.hasNext()) {

            DrawableShape s = (DrawableShape) itr.next();
            Point         delta = (Point) oItr.next();

            Dimension dim = s.getDimension();
            int xMargin = (int) Math.round(dim.width / 2);
            int yMargin = (int) Math.round(dim.height / 2);

            s.draw(g);

            //update the center point for the next drawing
            Point pt = s.getCenterPoint( );

            pt.x += delta.x;
            pt.y += delta.y;

            //adjust for the boundary case
            if (pt.x > windowSize.width - xMargin - inset.right) {

                pt.x = windowSize.width - xMargin - inset.right;
                delta.x = -delta.x;

            } else if ( pt.x < inset.left + xMargin) {

                pt.x = inset.left + xMargin;
                delta.x = -delta.x;

            } else if (pt.y > windowSize.height - yMargin - inset.bottom) {

                pt.y = windowSize.height - yMargin - inset.bottom;
                delta.y = -delta.y;

            } else if (pt.y < inset.top + yMargin)  {

                pt.y = inset.top + yMargin;
                delta.y = -delta.y;
            }
        }

    }

    /**
     * Draws the shapes at fixed, stationary locations
     *
     * @param Graphics the graphics context
     */
    private void stationaryDrawing(Graphics g) {

        Iterator itr = shapeList.iterator();

        while (itr.hasNext()) {

            DrawableShape s = (DrawableShape) itr.next();

            s.draw(g);
        }
    }
}