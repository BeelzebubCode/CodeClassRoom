package Lab3;
import java.util.Scanner;

public class Lab3Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your text: ");
        String message = sc.nextLine();

        for(int i = 0; i < message.length(); i++){
            switch (message.charAt(i)) {
                case 'a','e','i','o','u':
                    System.out.print(message.charAt(i)+"");
                    break;
                default:
                    System.out.print(" ");
                    break;
            }
        }
        
        System.out.println();
        for(int i = 0; i < message.length(); i++){
            switch (message.charAt(i)) {
                case 'a','e','i','o','u',' ':
                    System.out.print(" ");
                    break;
                default:
                    System.out.print(message.charAt(i));
                    break;
            }
        }
        
        sc.close();
    }
}

