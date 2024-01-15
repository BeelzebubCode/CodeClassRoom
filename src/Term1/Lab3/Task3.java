package Term1.Lab3;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        switch(number%2){
            case 0:
                System.out.println("Your number is even");
                break;
            case 1:
                System.out.println("Your number is odd");
                break;
        }
        sc.close();
    }
}
