package Term1.Lab2P2;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        int number1,number2,sum;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number A: ");
        number1 = sc.nextInt();

        System.out.print("Enter a number B: ");
        number2 = sc.nextInt();

        sum=number1+number2;
        System.out.println("sum = "+sum);
        if(sum%2==0){
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
        sc.close();
    }
}
