package Term1.Quiz;

import java.util.Scanner;

public class Quiz03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        for(int i = 1; i<=number; i++){
            for(int j = 1; j<=number; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
