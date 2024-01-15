package Term1.Lab2P2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        double a,b,c,d;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number A: ");
        a = sc.nextDouble();

        System.out.print("Enter a number B: ");
        b = sc.nextDouble();

        if(a>b){
            c=2*(Math.pow(a,2))+(3*b)-5;
            System.out.println("C = "+c);
        } else if(a<b){
            d=(Math.pow(b,2))-(3*a);
            System.out.println("D = "+d);
        }
        sc.close();
    }
}
