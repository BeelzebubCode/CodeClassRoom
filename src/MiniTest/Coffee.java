package MiniTest;
public class Coffee extends Drink{
    private boolean iced;

    public Coffee(String name, int size, char container, boolean iced){
        super(name,size,container);
        this.iced = iced;
    }

    public boolean isIced(){
        return iced;
    }

    public String getFullName(){
        String isIced = ((iced)? "iced" : "Hot");
        return isIced+" "+getName();
    }

    @Override
    public String toString(){
        return "name: "+getFullName()+"\nsize: "+getSizeMl()+"\ncontainer: "+getContainerDescription();
    }
}
