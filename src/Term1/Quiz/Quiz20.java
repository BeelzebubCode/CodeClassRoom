package Term1.Quiz;

import java.util.Scanner;

public class Quiz20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if(n >= 1 && n <= 10){
            int[] num = new int[n];
            for(int i = 0; i<num.length; i++){
                num[i] = sc.nextInt();
            }

            for(int j = 0; j<num.length; j++){
                if(num[j] %2 == 0) {
                    System.out.println("F");
                    continue;
                }
                
                System.out.println("T");
            }
        }

        sc.close();
    }
}
