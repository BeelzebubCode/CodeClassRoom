package Lab5;
public class Lab5Task7 {
    public static void main(String[] args) {
        Fraction half = new Fraction(1, 2);
        Fraction third = new Fraction(1, 3);
        System.out.print(half.toString()+" + "+third.toString());
        Fraction result = half.add(third);
        System.out.println(" = "+result.toString());
    }
}
