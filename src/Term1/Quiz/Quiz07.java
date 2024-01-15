package Term1.Quiz;

import java.util.Scanner;

public class Quiz07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // n แทนขนาดของ Array
        int n = sc.nextInt();

        int[] numbers = new int[n];

        for(int i = 0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
            numbers[i]+=2;
        }

        for(int num:numbers){
            System.out.println(num);
        }

        sc.close();
    }
}
