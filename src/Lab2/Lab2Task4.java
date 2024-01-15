package Lab2;
public class Lab2Task4 {
    public static void main(String[] args) {
        
        String input = "This is the way it is.";
        int numOfVowels = countVowels(input);
        System.out.println("The string \""+input+"\" has "+numOfVowels+" vowels");
    }

    static int countVowels(String inputIn){
        int count = 0;
        for(int i = 0; i<inputIn.length(); i++){
            switch(inputIn.charAt(i)){
                case 'a','e','i','o','u':
                    count++;
                    break;
            }
        }
        return count; 
    }
}

// import java.util.Scanner;
// public class Lab2Task4 {
//     static final int standardHours = 40;
//     static final float standardWagePerHour = 4.50f;
//     static final float overtimeWagePerHour = 6.75f;
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("How many hours did you work this week? ");
//         double hours = scanner.nextInt();
//         double wage = calculateWage(hours);
//         String wage2dp = String.format("%.2f",wage);
//         System.out.println("You will be paid £"+wage2dp+".");
//     }
//     private static double calculateWage(double hoursWorked) {


//         double standardWage = standardHours * standardWagePerHour;
//         double overtimeWorked = hoursWorked - standardHours;
//         double overtimeWage = overtimeWorked * overtimeWagePerHour;
//         double finalWage = standardWage + overtimeWage;
//         return finalWage;
//     }
// }

