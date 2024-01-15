package Term1.Lab2P2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args){
        String nameA,nameB;
        int A,B;

        Scanner sc = new Scanner(System.in);
        System.out.print("Player 1: ");
        nameA = sc.nextLine();

        System.out.print("Player 2: ");
        nameB = sc.nextLine();

        A=nameA.length();
        B=nameB.length();
        if(A<B){
            System.out.println(nameA+" is the shortest name");
        } else if(A>B){
            System.out.println(nameB+" is the shortest name");
        }
        sc.close();
    }
}
