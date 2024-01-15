package Term1.Quiz;

import java.util.Scanner;

public class Quiz01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        for(int i = 1; i<=number*2; i++){
            System.out.print(i);
        }

        sc.close();
    }
}
