package Term1.Lab4P2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        for (int i = 1; i <= 12; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        sc.close();
    }
}
