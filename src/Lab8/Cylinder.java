package Lab8;

public class Cylinder extends Circle{
    private int height;

    public Cylinder(String colour, int radius, int height){
        super(colour,radius);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
    
    @Override
    public double getArea(){
        return 2*Math.PI*getRadius()*height;
    }

    @Override
    public String toString(){
        return "Cylinder ("+getRadius()+", "+height+"): "+"This shape is "+getColour()+" ";
    }
}
