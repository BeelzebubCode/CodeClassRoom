package MiniTest;
public class MainDrink {
    public static void main(String[] args) {
        Drink d1 = new Drink("orange", 10, 'c');
        System.out.println(d1);
        Drink d2 = new Drink("orange", 20, 'b');
        System.out.println(d2);
        System.out.println("Name d1 is same d2 : "+d1.isSameName(d2));
        System.out.println("------------------------");
        Coffee c1 = new Coffee("Americano", 20, 'g', true);
        System.out.println(c1);
        Coffee c2 = new Coffee("Americano", 20, 'b', false);
        System.out.println(c2);
    }
}
