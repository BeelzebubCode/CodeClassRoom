package Term1.Quiz;

import java.util.Scanner;

public class Quiz11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] number = new int[n];

        for(int i = 0; i<number.length; i++){
            number[i] = sc.nextInt();
        }

        for(int i = 0; i<number.length; i++){
            System.out.println(checkNumber(number[i]));
        }

        sc.close();
    }   
    
    // public static void checkNumber(int[] arr){
    //     for(int i = 0; i<arr.length; i++){
    //         if(arr[i] %2 == 0) System.out.println("even");
    //         else System.out.println("odd");
    //     }
    // }

    public static String checkNumber(int a){
        if(a%2==0) return "even";
        else return "odd";
    }
}
