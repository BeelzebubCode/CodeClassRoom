package Lab5;
import java.util.Scanner;

public class Lab5Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A = ");
        String inputA = scanner.nextLine();
        System.out.print("B = ");
        String inputB = scanner.nextLine();
        Fraction fracA = Fraction.parse(inputA);
        Fraction fracB = Fraction.parse(inputB);
        Fraction result = fracA.add(fracB);
        System.out.println("A + B = "+result.toString());

        scanner.close();
    }
}
