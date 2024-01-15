package Term1.Lab2P2;

import java.util.Scanner;
public class Task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd number: ");
        int num = sc.nextInt();

        if(num%2==0){
            num = num + 1;
        }
        System.out.println("Your odd number is "+num);

        sc.close();
    }
}
