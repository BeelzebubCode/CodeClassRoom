package MiniTest;

public class Seat {
    private String colour;
    private int maxPeople;

    public Seat(String colour, int maxPeople){
        this.colour = colour;
        this.maxPeople = maxPeople;
    }

    public String getColour(){
        return colour;
    }

    public int getMaxPeople(){
        return maxPeople;
    }

    public boolean isSofaOrBench(){
        return maxPeople > 1;
    }
}
