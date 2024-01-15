package Term1.Lab7;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE , min = Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] numbers = new int[num];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();

            if(numbers[i] > max) max = numbers[i];
            if(numbers[i] < min) min = numbers[i];
        }

        System.out.println("Max number is "+max);
        System.out.println("Min number is "+min);

        sc.close();
    }
}
