package Quiz;

import java.util.Scanner;

public class CalculaterGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter score: ");
        int score = sc.nextInt();
        System.out.println("Grades : "+((score > 100 || score < 0) ? "God" : "FFFFFDCBAAA".charAt(score/10)));

        sc.close();
    }
    
}
