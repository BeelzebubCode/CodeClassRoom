package Term1.Lab6;

import java.util.Scanner;


public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenhite = sc.nextInt();

        double celsius = fahrenheitToCelsius(fahrenhite); 
        //String celsiusFormat = String.format("%.1f",celsius);          
        System.out.print(String.format("%.1f",celsius)+" Celsius");
        sc.close();
    }

    private static double fahrenheitToCelsius(double fahrenheitIn){
        double celsiusIn = (fahrenheitIn - 32.0)*5.0/9.0;
        return celsiusIn;
    }
}
