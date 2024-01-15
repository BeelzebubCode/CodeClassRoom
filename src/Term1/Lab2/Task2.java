package Term1.Lab2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // c = 2a2+3b-5 
        // d = b2-3a 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of a : ");
        double a = sc.nextDouble();
        System.out.println("a= "+a);
        System.out.print("Enter a number of b : ");
        double b = sc.nextDouble();
        System.out.println("b= "+b);

        double c = 2*(Math.pow(a,2))+(3*b)-5;
        double d = (Math.pow(b,2))-(3*a);
        System.out.println("result c = "+c);
        System.out.println("result d = "+d);

        sc.close();
    }
}
