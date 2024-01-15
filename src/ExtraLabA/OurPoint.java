package ExtraLabA;

public class OurPoint {
    private double x,y;

    public OurPoint(){
        x = 0;
        y = 0;
    }

    public OurPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public String toString(){
        return "["+this.getX()+", "+this.getY()+"]"; 
    }

    public boolean equals(OurPoint point){
        return getX() == point.getX() && getY() == point.getY();
    }

    public double distance(OurPoint point){
        double distance = Math.sqrt(Math.pow(point.getX()-getX(),2)+Math.pow(point.getY()-getY(),2));
        return distance;
    }
}
