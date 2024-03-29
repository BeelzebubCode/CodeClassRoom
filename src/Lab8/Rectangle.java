package Lab8;

public class Rectangle extends Shape{
    private int width = 0;
    private int height = 0;

    public Rectangle(String colour, int width, int height){
        super(colour);
        this.width = width;
        this.height = height;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    @Override
    public double getArea(){
        return width*height;
    }

    @Override
    public String toString(){
        return "Rectangle ("+width+", "+height+"): "+super.toString();
    }
}