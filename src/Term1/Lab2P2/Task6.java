package Term1.Lab2P2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in); 
        System.out.print("Say something: "); 
        String line = sc.nextLine(); 
        String name = "How are you?";

        if (line.equalsIgnoreCase(name)) { 
            System.out.println("Fine, thank you"); 
        } else { 
            System.out.println("I don't understand that"); 
        } 
        sc.close();
    }
}