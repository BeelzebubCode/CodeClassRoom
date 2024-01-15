package Term1.Quiz;

import java.util.Scanner;

public class Quiz25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] gift = new String[20];

        int index = 0 , count = 1;
        while(true){
            String input = sc.nextLine();
            count++;

            if(input.equals("*")) break;

            gift[index] = input;
            index++;
            if(index>20) break;
        }

        boolean checkN = true;
        String checkGift = sc.nextLine();
        for(int i = 0; i<count; i++){
            if(checkGift.equals(gift[i])){

                System.out.print("Y"); 
                checkN = false;

            } 
        }

        if(checkN) System.out.print("N");
        
        sc.close();
        
    }
}
