package Term1.Lab4;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        // for(int i = 1; i<=number; i++){
        //     if(i%2==0){
        //         System.out.println(i+" is even");
        //     } else {
        //         System.out.println(i+" is odd");
        //     }
        // }

        // int i = 1;
        // while(i<=number){
        //     if(i%2==0){
        //         System.out.println(i+" is even");
        //     } else {
        //         System.out.println(i+" is odd");
        //     }
        //     i++;
        // }

        for(int i = 1; i<=number; i++){
            if(i%2 == 0){
                System.out.println(i+" is even");
                continue;
            }
            System.out.println(i+" is odd");
        }
        sc.close();
    }
}
