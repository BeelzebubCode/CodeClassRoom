/*
    Introduction to OOP with Java 4th Ed, McGraw-Hill

    Wu/Otani

    Chapter 5 The DrawableShape class (Step 4)

    File: Step4/DrawableShape.java

*/

import java.awt.*;


class DrawableShape {

//----------------------------------
//    Data Members
//----------------------------------

    // Constant for Ellipse 
    public static final int ELLIPSE = 0;

    // Constant for Triangle 
    public static final int RECTANGLE = 1;

    // Constant for Rectangle 
    public static final int ROUNDED_RECTANGLE = 2;

    // Default dimension 
    private static final Dimension DEFAULT_DIMENSION = new Dimension(200, 200);

    // Default center point 
    private static final Point DEFAULT_CENTER_PT = new Point(350, 350);
    
    // Default color 
    private static final Color DEFAULT_COLOR = Color.blue;

    // Center point of this shape 
    private Point     centerPoint;

    // Dimension of this shape 
    private Dimension dimension;

    // The shape type 
    private int       type;
    
    
    // The color to fill the shape 
    private Color     fillColor;

//----------------------------------
//    Constructors
//----------------------------------



    // Constructor with the shape type, dimension, and color
    public DrawableShape(int sType, Dimension sDim,
                         Point sCenter, Color sColor) {
      
        type        = sType;
        dimension   = sDim;
        centerPoint = sCenter;
        fillColor   = sColor;
    }


//-------------------------------------------------
//      Public Methods:
//
//          void      draw            ( java.awt.Graphcs  )
//
//          Point     getCenterPoint  (                   )
//          Dimension getDimension    (                   )
//
//          void      setCenterPoint  ( java.awt.Point    )
//
// the following required by Ch5DrawShape
//
//          void      setType         ( int               )
//------------------------------------------------

    // Draws this object on the passed Graphics context
    public void draw(Graphics g) {

        g.setColor(fillColor);
      
        drawShape(g);
    }


    // Returns the center point of this drawable shape.
    public Point getCenterPoint( ) {

        return centerPoint;
    }


    // Returns the dimension of this shape.
    // The dimension's width and height bounds (surrounds)
    // this shape.
    public Dimension getDimension( ) {

        return dimension;
    }


    // Sets the center point of this drawable shape.
    public void setCenterPoint(Point point) {

        centerPoint = point;
    }

    // Sets the type of this shape: ellipse, rectangle, or
    // rounded rectangle
    public void setType(int shapeType) {

        type = shapeType;
    }

    // Draws the selected shape.
    private void drawShape(Graphics g) {
        switch (type) {
            case ELLIPSE:
                    g.fillOval(centerPoint.x - dimension.width/2,
                                centerPoint.y - dimension.height/2,
                                dimension.width,
                                dimension.height);

                    break;

            case RECTANGLE:
                    g.fillRect(centerPoint.x - dimension.width/2,
                                centerPoint.y - dimension.height/2,
                                dimension.width,
                                dimension.height);
                    break;

            case ROUNDED_RECTANGLE:
                    g.fillRoundRect(centerPoint.x - dimension.width/2,
                                      centerPoint.y - dimension.height/2,
                                      dimension.width,
                                      dimension.height,
                                      (int) (dimension.width * 0.3),
                                      (int) (dimension.height * 0.3));
                    break;
         }
    }

}