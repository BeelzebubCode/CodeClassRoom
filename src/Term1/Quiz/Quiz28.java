package Term1.Quiz;

import java.util.Scanner;

public class Quiz28 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        for(int i = 1; i<=6; i++){
            if(i%2 == 0){
                System.out.print(" ");
                for(int j = 1; j<=size+2; j++) System.out.print("*");
            } 
            else {

                if(i==5){
                    for(int k = 1; k<=size+4; k++) System.out.print("*");
                } else {
                    System.out.print("  ");
                    for(int a = 1; a<=size; a++ ) System.out.print("*");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
