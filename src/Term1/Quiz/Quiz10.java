package Term1.Quiz;

import java.util.Scanner;

public class Quiz10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean check = true;
        // n แทนขนาด Array
        int n = sc.nextInt();

        int[] number = new int[n];

        for(int i = 0; i<n; i++){
            number[i] = sc.nextInt();
        }

        for(int i = 0; i<number.length; i++){

            for(int j = i+1; j<number.length; j++){
                if(number[i]+number[j]==10){
                    System.out.print(i+" "+j);
                    check = false;
                }
            }
        }
        

        if(check){
            System.out.print("-1");
        }

        sc.close();
    }
}    
