package MiniTest;

import java.util.Scanner;

public class MiniTest1D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] message = new String[100];

        int i = 0;
        while(true){
            String text = sc.next();
            if(text.equals("quit")) break;
            message[i++] = text;
        }

        for(int j = 0; j < i; j++){
            System.out.println(""+message[j].charAt(0)+message[j].charAt(message[j].length()-1));
        }

        sc.close();
    }
}
