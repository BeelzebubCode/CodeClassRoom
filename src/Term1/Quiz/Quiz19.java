package Term1.Quiz;

import java.util.Scanner;

public class Quiz19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        byte[] num = new byte[3];
        for(int i = 0; i<3; i++){
            num[i] = sc.nextByte();
        }

        for(int i = 0; i<3; i++){
            for(int j = 0; j<2; j++){
                if(num[j] < num[j+1]){
                    byte temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
                
            }
        }

        String abc = sc.next();

        for(int i = 0; i<3; i++){
            if(abc.charAt(i) == 'C') System.out.print(num[0]+" ");
            else if(abc.charAt(i) == 'B') System.out.print(num[1]+" ");
            else if(abc.charAt(i) == 'A') System.out.print(num[2]+" ");
        }

        sc.close();
    }
}
