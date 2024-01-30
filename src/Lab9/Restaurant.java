package Lab9;
public class Restaurant extends Place{
    private String foodType;

    public Restaurant(String name, String address, String province, String food){
        super(name,address,province);
        this.foodType = food;
    }

    public String getFoodType(){
        return foodType;
    }

    public boolean isThaiFood(){
        return foodType.equals("Thai");
    }

    public boolean hasSameFoodType(Restaurant r){
        return foodType.equals(r.getFoodType());
    }
}
