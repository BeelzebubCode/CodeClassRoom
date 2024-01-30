package Lab8;

public class Lab8Task4 {
    public static void main(String[] args) {
        Shape shapeA = new Rectangle("pink", 3, 4);
        Shape shapeB = new Circle("yellow",7);

        System.out.println(shapeA.toString());
        System.out.println(shapeB.toString());

        //Rectangle r1 = (Rectangle) shapeA;
        //System.out.println("Width = "+shapeA.getWidth());

        // Circle c1 = (Circle) shapeB;
        //System.out.println("Radius = "+shapeB.getRadius());
    }
}
