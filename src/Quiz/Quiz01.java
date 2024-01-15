package Quiz;

import java.util.Scanner;

public class Quiz01 {
    public static void main(String[] args) {
        // int x;
        // for(int i = 1; i<=100; i++){
        //     x = (int)(1280+(700+Math.random()*1280));
        //     System.out.println(x);
        // }

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        char[] nameChar = name.toCharArray();

        int count = 0;
        for(int i = 0; i<nameChar.length; i++){
            switch(nameChar[i]){
                case 'a','e','i','o','u','A','E','I','O','U':
                    count ++;
            }
        }

        System.out.println(count);
        sc.close();
        
    }
}
