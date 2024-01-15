package ExtraLabA;
public class DemoCircle{
    public static void main(String[] args) {
        OurPoint p = new OurPoint(5,10);
        OurCircle circle1 = new OurCircle(p, 25);
        System.out.println("Circle: "+circle1.toString());
        System.out.println("Area: "+circle1.getArea());
        System.out.println("Circumference: "+circle1.getCircumference());
        p.setX(10);
        circle1.setCenter(p);
        System.out.println("Circle: "+circle1.toString());
    }
}