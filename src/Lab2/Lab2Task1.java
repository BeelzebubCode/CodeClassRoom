package Lab2;
import java.util.Scanner;

public class Lab2Task1{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your name? ");
        String name = scanner.nextLine();

        // ผิดบรรทัดที่ 12 ควรเปลี่ยนเป็น 
        int numberOfLetters = name.length();
        System.out.println("There are "+numberOfLetters+" letters in your name.");

        scanner.close();
    }
}