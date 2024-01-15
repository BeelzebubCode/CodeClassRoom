package Term1.Quiz;

import java.util.Scanner;
public class Quiz23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();

        for(int i = 1; i<=3; i++){
            if(i%2==1){
                for(int j = 1; j<=2; j++) System.out.print(" ");
                for(int j = 1; j<=w; j++) System.out.print("*");
                System.out.println();
            }

            else {
                for(int j = 1; j<=1; j++)System.out.print(" ");
                for(int j = 1; j<=w+2; j++) System.out.print("*");
                System.out.println();
            }
        }

        for(int i = 1; i<=3; i++){
            if(i%2==1){
                 for(int j = 1; j<=1; j++) System.out.print(" ");
                for(int j = 1; j<=w+2; j++) System.out.print("*");
                System.out.println();
            }
            else{
                for(int j = 1; j<=w+4; j++) System.out.print("*");
                System.out.println();
            }
        }

        sc.close();
    }
}
