package ExtraLabA;
public class DemoOurPoint {
    public static void main(String[] args) {
        OurPoint p = new OurPoint(3, 12);
        OurPoint q = new OurPoint(3, 4);
        System.out.println("p@ " + p.toString());
        System.out.println("q@ " + q.toString());
        if (p.equals(q)) {
            System.out.println("p is equal q");
        } else {
            System.out.println("p is not equal q");
        }
        double distance = p.distance(q);
        System.out.println("Distance(1): "+distance);
        p.setX(3);
        p.setY(4);
        distance = p.distance(q);
        System.out.println("Distance(2): "+distance);
        System.out.println(p.equals(q));
        System.out.println(p.toString());
    }
}


