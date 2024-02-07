package HomeWork;
/*
    Introduction to OOP with Java 4th Ed, McGraw-Hill

    Wu/Otani

    File: Step4/Ch5DrawShape.java

*/
import java.awt.*;
import javax.swing.*;

//Allow the user to select a color (Step 4)

class Ch5DrawShape {

    // The DrawingBoard object for simulating screensaver 
    private DrawingBoard canvas;

    
 //---------------------------
 //  Main method
 //---------------------------

    public static void main( String[] args ) {

        Ch5DrawShape screensaver = new Ch5DrawShape( );

        screensaver.start();
    }

//------------------------------
//
//  Constructor
//
//------------------------------
    
    public Ch5DrawShape( ) {

        canvas = new DrawingBoard( );
    }


//-----------------------------------
//
//  Public Methods:
//
//      void    start   (   )
//
//-------------------------------------

    // The top method to start the whole program
    public void start( ) {

        DrawableShape shape1 = getShape();

        canvas.addShape(shape1);

        canvas.setMovement(DrawingBoard.SMOOTH);

        canvas.setVisible(true);
        canvas.start();

    }


//-----------------------------------
//
//  Private Methods:
//
//      DrawableShape    getShape        (       )
//      Point            inputCenterPoint(       )
//      Color            inputColor      (       )
//      Dimension        inputDimension  (       )
//      int              inputShapeType  (       )
//
//-------------------------------------
    /*
      Gets the shape selection from the user. The possible
      shapes are Ellipse, Triangle, and Rectangle. The size
      of the selected shape is expressed in terms of its width
      and height, as the shape's bounding rectangle. The user
      has an option of specifying the center point. A random
      point is chosen if the user does not specify the
      center point.
    */
    private DrawableShape getShape( ) {

        int type = inputShapeType();

        Dimension dim = inputDimension();

        Point centerPt = inputCenterPoint();
        
        Color color = inputColor();

        DrawableShape shape = new DrawableShape(type, dim, centerPt, color);

        return shape;
    }

    // Let the user select the center point of the shape.
    private Point inputCenterPoint( ) {

        String str = JOptionPane.showInputDialog(null,
                            "Enter the x value of the center point\n" +
                            "    between 200 and 800 inclusive");

        int x = Integer.parseInt(str);

        if (x < 200 || x > 800) {
            x = 200;
        }

        str = JOptionPane.showInputDialog(null,
                            "Enter the y value of the center point\n" +
                            "    between 100 and 500 inclusive");

        int y = Integer.parseInt(str);

        if (y < 100 || y > 500) {
            y = 100;
        }

        return new Point(x, y);
    } 
    
    // Let the user select a color.
    private Color inputColor( ) {

        String str = JOptionPane.showInputDialog(null,
                            "Selection: Enter the Color number\n" +
                            "   1 - Red \n" +
                            "   2 - Green \n" +
                            "   3 - Blue \n" +
                            "   4 - Yellow \n" +
                            "   5 - Magenta \n" );

        int selection = Integer.parseInt(str);

        Color color;
        switch (selection) {

            case 1:  color = Color.red;
                     break;

            case 2:  color = Color.green;
                     break;

            case 3:  color = Color.blue;
                     break;

            case 4:  color = Color.yellow;
                     break;

            case 5:  color = Color.magenta;
                     break;

            default: color = Color.red;
                     break;
        }

        return color;
    }   

    // Let the user select the dimension of the shape.
    private Dimension inputDimension( ) {

        String str = JOptionPane.showInputDialog(null,
                            "Enter the width of the shape\n" +
                            "    between 100 and 500 inclusive");

        int width = Integer.parseInt(str);

        if (width < 100 || width > 500) {
            width = 100;
        }

        str = JOptionPane.showInputDialog(null,
                            "Enter the height of the shape\n" +
                            "    between 100 and 500 inclusive");

        int height = Integer.parseInt(str);

        if (height < 100 || height > 500) {
            height = 100;
        }

        return new Dimension(width, height);
    }


// Let the user select the shape: Ellipse, Triangle, and
    // Rectangle.
    private int inputShapeType( ) {

        String str = JOptionPane.showInputDialog(null,
                            "Selection: Enter the Shape number\n" +
                            "   1 - Ellipse \n" +
                            "   2 - Rectangle \n" +
                            "   3 - Rounded Rectangle \n" );

        int selection = Integer.parseInt(str);

        int type;
        switch (selection) {

            case 1:  type = DrawableShape.ELLIPSE;
                     break;

            case 2:  type = DrawableShape.RECTANGLE;
                     break;

            case 3:  type = DrawableShape.ROUNDED_RECTANGLE;
                     break;

            default: type = DrawableShape.ELLIPSE;
                     break;
        }

        return type;
    }
}