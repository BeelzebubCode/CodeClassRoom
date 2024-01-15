package Term1.Quiz;

import java.util.Scanner;

public class Quiz17 {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE , min = Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if(n >= 1 && n <=1000){
            for(int i = 1; i<=n; i++){
                int number = sc.nextInt();
                if(number>max) max = number;
                if(number<min) min = number;
            }

            System.out.println(min);
            System.out.println(max);
        }

        sc.close();
    }
}
