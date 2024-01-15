package Lab6;
public class Calculator {
    // Task 1
    public static int sum(int[] numbers){
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];
        }
        return sum;
    }

    public static double sum(double[] numbers){
        double sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];
        }
        return sum;
    }

    public static double average(int[] numbers){
        // int sum = sum(numbers);
        // double avg = sum/numbers.length;
        // return avg;
        return sum(numbers) / numbers.length;
    }

    public static double average(double[] numbers){
        double sum = sum(numbers);
        return sum/numbers.length;
    }

    // Task 5
    public static double sum(int[] list1, double[] list2){
        return sum(list1) + sum(list2);
    }

    // Task 6
    public static double sum(double[] list1, int[] list2){
        return sum(list1) + sum(list2);
    }
}
