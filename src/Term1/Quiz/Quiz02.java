package Term1.Quiz;

import java.util.Scanner;

public class Quiz02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        for(int i = 1; i<=12; i++){
            System.out.println(number*i);
        }
        sc.close();
    }    
}
