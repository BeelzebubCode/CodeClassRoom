package Term1.Lab6;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();

        doubleFormat(number1);
        doubleFormat(number2);

        sc.close();
    }

    private static void doubleFormat(double number){
        System.out.print(String.format("%.2f",number) + " "); 
    }
}
