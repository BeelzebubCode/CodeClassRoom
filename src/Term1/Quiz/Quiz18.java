package Term1.Quiz;

import java.util.Scanner;
public class Quiz18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a >= 0 && a <= 1000000000 && b >= 0 && b <=1000000000){
            System.out.println(a+b);
        }

        sc.close();
    }
}
