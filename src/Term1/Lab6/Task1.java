package Term1.Lab6;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius circle 1: ");
        double area1 = sc.nextDouble();

        System.out.print("Enter radius circle 2: ");
        double area2 = sc.nextDouble();

        System.out.print(area(area1,area2));

        sc.close();
    }    

    private static String area(double radius1, double radius2){
        DecimalFormat df = new DecimalFormat("0.0");
        double area1 = (3.142*(Math.pow(radius1,2)));
        double area2 = (3.142*(Math.pow(radius2,2)));
        double result = Math.abs(area1-area2);

        String answer = "Area different is: "+df.format(area1)+" - "+ df.format(area2) +" = "+df.format(result)+" CM ";
        return answer;
    }
}
