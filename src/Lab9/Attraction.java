package Lab9;
public class Attraction extends Restaurant{
    private int entryTicketPrice;

    // n = name ad = address pv = province ft = foodType
    public Attraction(String n, String ad, String pv, String ft, int price){
        super(n,ad,pv,ft);
        entryTicketPrice = price;
    }

    public int getEntryTicketPrice(){
        return entryTicketPrice;
    }

    public String getAttractionType(){
        return getFoodType();
    }

    public boolean isFreeEntry(){
        return getFoodType().equals("Shopping Centre");
    }
}
