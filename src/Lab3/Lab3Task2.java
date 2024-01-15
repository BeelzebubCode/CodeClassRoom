package Lab3;
import java.util.Scanner;

public class Lab3Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of assessments: ");
        int numberOfAssessments = sc.nextInt();
        float[] marks = new float[numberOfAssessments];
          
        for (int i = 1; i <= numberOfAssessments; i++) {
           System.out.print("Mark for assessment " + i + ": ");
           marks[i-1] = sc.nextFloat();
        }
          
        float sum = 0;
        for(float number : marks){
            sum+=number;
        }
      
        float average = sum/marks.length; 
        System.out.println("Your average mark is: " + average);

        sc.close();
     }
  }
