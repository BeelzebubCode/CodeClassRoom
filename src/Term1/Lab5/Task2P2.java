package Term1.Lab5;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Task2P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter value in pounds: ");
        double pounds = sc.nextDouble();
        System.out.println(poundTokilo(pounds));

        sc.close();
    }

    private static String poundTokilo(double poundIn){
        DecimalFormat df = new DecimalFormat(".##");
        return "Value in kilos is "+df.format(poundIn/2.2)+" Kilo";
    }
}
