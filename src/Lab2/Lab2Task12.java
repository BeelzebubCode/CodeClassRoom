package Lab2;

import java.util.Scanner;
public class Lab2Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me 2 words your would like to order.");
        String line = scanner.nextLine();
        scanner.close();
        String[] words = line.split(" ");
        if (words.length != 2) {
            System.err.println("Huh, you can't count!");
            return;
        }
        System.out.println("Ordered:");
        String word1 = words[0].toLowerCase();
        String word2 = words[1].toLowerCase();
        if (word1.compareTo(word2) < 0) {
            System.out.println(word1 + " " + word2);
        }
        else {
            System.out.println(word2 + " " + word1);
        } 
    }
}

