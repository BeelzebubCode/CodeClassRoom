package Term1.Lab3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        String Vowel;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        Vowel = sc.next();

        char checkVowel = Vowel.charAt(0);

        switch(checkVowel){
            case 'a','A','e','E','i','I','o','O','u','U':
                System.out.println(checkVowel+" is a Vowel");
                break;
            default :
                System.out.println(checkVowel+" is a Consonant");
        }
        sc.close();
    }
}
