package Lab2;
import java.util.Scanner;

public class Lab2Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many stars?");
        int star = sc.nextInt();

        for(int i = 1; i<=star; i++){
            for(int j = 1; j<=star; j++){
                if(j==i){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
