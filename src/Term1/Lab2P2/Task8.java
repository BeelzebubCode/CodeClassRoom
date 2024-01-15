package Term1.Lab2P2;

import java.util.Scanner;

class Task8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Player 1: ");

        String P1 = sc.nextLine();

        System.out.print("Player 2: ");

        String P2 = sc.nextLine();

        if(P1.charAt(0) == P2.charAt(0)){
            System.out.println("The names both start with " + P1.charAt(0));
        } 
        else 
        {
            System.out.println("The names start with "+ P1.charAt(0) + " and " + P2.charAt(0));
        }
        sc.close();        
    }
}
