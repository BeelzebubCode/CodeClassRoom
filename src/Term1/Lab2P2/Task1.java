package Term1.Lab2P2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        if (x > 10) {
            System.out.println("Green");
        }
        System.out.println("Red");
        if (x < 5) {
            System.out.println("Yellow");
            System.out.println("Blue");
        }
        sc.close();
    }
}
