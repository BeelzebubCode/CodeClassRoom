package Lab9;
public class Place {
    private String name;
    private String address;
    private String province;

    public Place(String name, String address, String province){
        this.name = name;
        this.address = address;
        this.province = province;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getProvince(){
        return province;
    }

    public String toString(){
        return name+", "+address+", "+province;
    }

    public boolean equals(Place p){
        return name.equals(p.getName()) && address.equals(p.getAddress()) && province.equals(p.getProvince());
    }
}