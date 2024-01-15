package Term1.Lab2P2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if(number>5){
            number=5;
        } 
        else if(number<1){
            number=1;
        } 
        System.out.println(number);
        sc.close();
    }
}
