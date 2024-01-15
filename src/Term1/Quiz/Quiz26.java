package Term1.Quiz;

import java.util.Scanner;

public class Quiz26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numbers = new int[n];

        inputNumbers(sc,numbers);
        
        double age = age(numbers,n);
        System.out.println(age);
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] > age){
                System.out.println(numbers[i]);
            }
        }
    }

    static void inputNumbers(Scanner scIn , int[] numberIn){
        for(int i = 0; i<numberIn.length; i++){
            numberIn[i] = scIn.nextInt();
        }
    }

    static double age(int[] numberIn , int nIn){
        double age = 0;
        for(int i = 0; i<numberIn.length; i++){
            age+=numberIn[i];
        }

        return age/nIn;
    }
}
