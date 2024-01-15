package Term1.Quiz;

import java.util.Scanner;

public class Quiz09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n แทนขนาด Array
        int n = sc.nextInt();

        int[] numbers = new int[n];

        for(int i = 0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        // for(int i = 0; i<numbers.length; i++){
        //     if(numbers[i] %2 == 0){
        //         System.out.println(i);
        //     }

        checkEven(numbers);

        sc.close();
    }

    private static void checkEven(int[] numbersIn){
        for(int i = 0; i<numbersIn.length; i++){
            if(numbersIn[i] %2 == 0){
                System.out.println(i);
            }
        }
    }
}
