package MiniTest;

import java.util.Scanner;

public class MiniTest1C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte number = sc.nextByte();

        for(int i = 1; i <= number; i++){
            for(int j = 1; j <= number; j++){
                if(j == 1 || i == 1 || i == number){
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
