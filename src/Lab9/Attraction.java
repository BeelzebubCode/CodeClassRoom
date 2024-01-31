package Lab9;
public class Attraction extends Place{
    private String attractionType;
    private int entryTicketPrice;

    // n = name ad = address pv = province at = attractionType
    public Attraction(String n, String ad, String pv, String at, int price){
        super(n,ad,pv);
        attractionType = at;
        entryTicketPrice = price;
    }

    public int getEntryTicketPrice(){
        return entryTicketPrice;
    }

    public String getAttractionType(){
        return attractionType;
    }

    public boolean isFreeEntry(){
        return attractionType.equals("Shopping Centre");
    }
}
