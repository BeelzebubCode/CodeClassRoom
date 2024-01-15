package Term1.Lab7;

import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] mark = new int[10];

        for(int i = 0; i<mark.length; i++){
            System.out.print("Enter the exam score for student "+(i+1)+" : ");
            mark[i] = sc.nextInt();
            mark[i] +=5 ;
        }

        // for(int i = 0; i<mark.length; i++){
        //     mark[i] +=5 ;
        // }

        int i = 1;
        for(int scores:mark){
            if(scores>=40) System.out.println("student "+i+" passed the exam");
            else System.out.println("student "+i+" failed the exam");
            i++;
        }

        sc.close();
    }
}
