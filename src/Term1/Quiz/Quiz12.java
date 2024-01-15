package Term1.Quiz;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Quiz12 {
    public static void main(String[] args) {
        //ราคา * ภาษี / 100 + ราคา

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double n = sc.nextDouble();
        double m = sc.nextDouble();

        System.out.println(df.format(tax(n,m)));
        sc.close();

    }

    private static double tax(double price , double taxRate){
        return price*taxRate/100 + price;
    }
}
