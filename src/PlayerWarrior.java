class PlayerWarrior implements ICollect{
    private String name;
    private double hp;
    private String weapon;
    private double numberOfBanana;
    private double numberOfDiamond;

    public PlayerWarrior(String name, String weapon, double hp){
        this.name = name;
        this.weapon = weapon;
        this.hp = hp;
    }

    public void calculateHP(){
        hp+=numberOfBanana*5;
    }

    public String getName(){
        return name;
    }

    public double getHP(){
        return hp;
    }

    public void setHP(double hp){
        this.hp = hp;
    }

    public String getWeapon(){
        return weapon;
    }

    public double getNumberOfBanana(){
        return numberOfBanana;
    }

    public void setNumberOfBanana(double nob){
        // nob => numberOfBanana
        numberOfBanana = nob;
    }

    public double getNumberOfDiamond(){
        return numberOfDiamond;
    }

    public void setNumberOfDiamond(double nod){
        // nod => numberOfDiamond
        numberOfDiamond = nod;
    }

    public void collectDiamon(){
        Diamond.numberOfDiamond--;
        numberOfDiamond++;
    }

    public void collectBanana(){
        Banana.numberOfBanana--;
        numberOfBanana++;
    }

}