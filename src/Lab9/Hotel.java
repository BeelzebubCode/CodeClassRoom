package Lab9;
public class Hotel extends Place{
    private int price;

    // n = name ad = address pv = province
    public Hotel(String n, String ad, String pv, int price){
        super(n,ad,pv);
        this.price = price;
    }

    public int calculatePrice(int day){
        return price*day;
    }

    public int calculatePrice(int day, int rooms){
        return price*rooms*day;
    }
}
