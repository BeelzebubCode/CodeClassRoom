package Term1.Lab3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){
        int age,type,ticket;

        Scanner sc = new Scanner(System.in);
        System.out.print("Cinema type: ");
        type = sc.nextInt();

        System.out.print("Age: ");
        age = sc.nextInt();

        System.out.print("Ticket for : ");
        ticket = sc.nextInt();

        switch(type){
            case 1:
                if(age>18){
                    System.out.println("Total price is: "+(ticket*120)+" bath");
                } else if(age<=18){
                    System.out.println("Total price is: "+(ticket*80)+" bath");
                }
                break;
            case 2:
                if(age>18){
                    System.out.println("Total price is: "+(ticket*160)+" bath");
                } else if(age<=18){
                    System.out.println("Total price is: "+(ticket*120)+" bath");
                }
                break;
        }
        sc.close();
    }
}
