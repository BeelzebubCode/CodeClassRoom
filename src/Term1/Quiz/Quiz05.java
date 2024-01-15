package Term1.Quiz;

import java.util.Scanner;

public class Quiz05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        for(int i = 1; i<=number; i++){
            for(int j = 1; j<=number; j++){

                if(j==i) System.out.print("1");
                else System.out.print("0");
            }
            System.out.println();
        }

        sc.close();
    }
}
