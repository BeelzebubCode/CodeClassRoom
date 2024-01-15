package Term1.Lab3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        char choose;

        Scanner sc = new Scanner(System.in);
        System.out.println("Started walk");
        System.out.print("A or B? ");
        choose = sc.next().charAt(0);

        if(choose == 'A'){
            System.out.println("You walked past the forest ");
            System.out.print("A or B? ");
            choose = sc.next().charAt(0);
            if(choose == 'A'){
                System.out.println("Finished walk ");
            } else if(choose == 'B'){
                System.out.println("You walked past the monkey ");
                System.out.println("Finished walk ");
            }
        } else if(choose == 'B'){
            System.out.println("You walked past the house");
            System.out.println("You walked past the lake ");
            System.out.println("Finished walk ");
        }
        sc.close();
    }   
}
