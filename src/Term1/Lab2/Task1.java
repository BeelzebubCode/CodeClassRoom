package Term1.Lab2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of x: ");
        int x = sc.nextInt();
        System.out.println("x= "+x);
        System.out.print("Enter a number of y: ");
        int y = sc.nextInt();
        System.out.println("y= "+y);
        System.out.print("Enter a number of z: ");
        int z = sc.nextInt();
        System.out.println("z= "+z);
        System.out.println(x+" + "+y+" + "+z+" = "+(x+y+z));

        sc.close();
    }
}