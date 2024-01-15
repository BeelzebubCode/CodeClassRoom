package Lab5;
public class Lab5Task4 {
    public static void main(String[] args) {
        Fraction frac = new Fraction(3, 6);
        System.out.println(frac.toString()+" = "+frac.toDouble());
        frac.simplify();
        System.out.println(frac.toString()+" = "+frac.toDouble());
    }
}
