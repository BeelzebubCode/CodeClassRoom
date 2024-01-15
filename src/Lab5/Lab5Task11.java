package Lab5;
import java.util.Scanner;

public class Lab5Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fraction sum = new Fraction(0,1);
        Fraction fracNum;
        while(true){
            System.out.print("Input data x/y or q to quit: ");
            String fracStr = sc.nextLine();
            if(fracStr.equals("q")) break;

            fracNum = Fraction.parse(fracStr);
            sum = sum.add(fracNum);
        }

        sum.simplify(); // ย้ายไปที่ add ได้
        System.out.println("**** Sum of Fraction = "+sum);
        sc.close();
    }
}
