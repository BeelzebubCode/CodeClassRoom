package Lab8;

public class Circle extends Shape{
    private int radius;

    public Circle(String colour, int radius){
        super(colour);
        this.radius = radius;
    }

    public int getRadius(){
        return radius;
    }

    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }

    @Override
    public String toString(){
        return "Circle ("+radius+"): "+super.toString();
    }
}
