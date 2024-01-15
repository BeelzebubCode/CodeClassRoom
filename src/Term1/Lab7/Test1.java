package Term1.Lab7;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        boolean start = true;
        int sumString = 0, numString = 0;
        String[] name = new String[100];

        Scanner sc = new Scanner(System.in);

        int i = 1;
        while(start){
            System.out.print("Enter name or stop : ");
            name[i] = sc.nextLine();

            if(name[i].equalsIgnoreCase("stop")){
                start = false;
                break;
            }

            numString = name[i].length();
            sumString+=numString;
            System.out.println(numString);

            i++;
        }

        System.out.println("Sum = "+sumString);
        sc.close();
    }
}
