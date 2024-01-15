package Term1.Quiz;

import java.util.Scanner;

public class Quiz24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<2; i++){
            for(int j=0; j<2-i; j++) System.out.print(" ");
            for(int j=0; j<n+(2*i); j++) System.out.print("*");
            System.out.println();
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<2-i; j++) System.out.print(" ");
            for(int j=0; j<n+(2*i); j++) System.out.print("*");
            System.out.println();
        }

        for(int i=1; i>=0; i--){
            for(int j=0; j<2-i; j++) System.out.print(" ");
            for(int j=0; j<n+(2*i); j++) System.out.print("*");
            System.out.println();
        }

        sc.close();
    }
}
