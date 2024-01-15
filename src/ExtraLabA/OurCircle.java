package ExtraLabA;

public class OurCircle {
    private OurPoint center;
    private double radius;

    public OurCircle(){
        center = new OurPoint(0,0);
        radius = 0;
    }

    public OurCircle(OurPoint point, double radius){
        center = new OurPoint(point.getX(),point.getY());
        this.radius = radius;
    }

    public OurPoint getCenter(){
        return center;
    }

    public double getRadius(){
        return radius;
    }

    public void setCenter(OurPoint point){
        center.setX(point.getX());
        center.setY(point.getY());
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public String toString(){
        return "center@ ["+center.getX()+", "+center.getY()+"] radius: "+getRadius();
    }

    public double getArea(){
        return Math.PI*(Math.pow(getRadius(), 2));
    }

    public double getCircumference(){
        return 2*Math.PI*getRadius();
    }
}
 