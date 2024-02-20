package MiniTest;
public class Drink {
    private String name;
    private int sizeMl;
    private char container;

    public Drink(String name, int size, char container){
        this.name = name;
        sizeMl = size;
        this.container = container;
    }

    public String getName(){
        return name;
    }

    public int getSizeMl(){
        return sizeMl;
    }

    public char getContainer(){
        return container;
    }

    public String toString(){
        return "name: "+name+"\nsize: "+sizeMl+"\ncontainer: "+getContainerDescription();
    }

    public String getContainerDescription(){
        if(container == 'c') return "can";
        else if(container == 'b') return "bottle";
        else return "glass";
    }

    public boolean isSameName(Drink d){
        return name.equals(d.name);
    }
}
