package Lab3;
import java.util.Scanner;

public class Lab3Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Marks: ");
        String input = sc.nextLine();
        
        String[] number = input.split(" ");
        float average = 0;
        for(int i = 0; i < number.length; i++){
            average += Float.parseFloat(number[i]);
        }
        average/=number.length;

        System.out.println("Your average mark is: " + average);
        sc.close();
    }
}
