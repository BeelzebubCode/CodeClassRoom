package Term1.Lab5;

import java.util.Scanner;

public class TTO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        for(int i = number; i>=0; i--){
            
            System.out.println(i);

            switch(i){
                case 1:
                    System.out.println("Three");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("One");
            }

            sc.close();
        }
    }
}
