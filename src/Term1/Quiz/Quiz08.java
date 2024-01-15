package Term1.Quiz;

import java.util.Scanner;

public class Quiz08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n แทนขนาดของ Array
        int n = sc.nextInt();

        int[] numbers = new int[n];
        for(int i = 0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        // i = n-1 ได้เหมือนกัน
        for(int i = numbers.length-1; i>=0; i--){
            System.out.println(numbers[i]);
        }

        sc.close();
    }    
}
