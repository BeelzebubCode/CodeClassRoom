package MiniTest;

import java.util.Scanner;

public class MiniTest1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for(int i = 1; i <= number; i++){
            System.out.print(i*i+" ");
        }

        sc.close();
    }
}
