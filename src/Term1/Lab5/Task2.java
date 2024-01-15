package Term1.Lab5;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Task2 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a radius(r): ");
        double radius = sc.nextDouble();

        System.out.print("Circle's area is "+df.format(area(radius))+" CM^2");
        sc.close();
    }

    private static double area(double radiusIn){
        double area = 3.142*(Math.pow(radiusIn,2));
        return area;

    }
}
