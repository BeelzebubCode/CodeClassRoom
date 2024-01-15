package Lab7;

public class Order {
    private int table;
    private Product product; 
    private boolean complete;

    public Order(int table, Product product){
        this.table = table;
        this.product = product;
    }

    public int getTable(){
        return table;
    }

    public Product getProduct(){
        return product;
    }

    public void setProduct(Product product){
        this.product = product;
    }

    public boolean isComplete(){
        return complete;
    }

    public void setComplete(boolean complete){
        this.complete = complete;
    }

    public String toString(){
        String result = "Table "+table+": "+this.getProduct().getName() + ((isComplete()) ? " [/]" : " [ ]");
        // if(isComplete()) return result+=" [/]";
        // return result+=" [ ]";
        return result;
    }
}
