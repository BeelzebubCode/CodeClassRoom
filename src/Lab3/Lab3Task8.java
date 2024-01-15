package Lab3;
import java.util.Arrays;
import java.util.Scanner;

public class Lab3Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();
        String[] numString = num.split(",");
        
        int[] numbers = new int[numString.length];
        int index = 0;
        for(String number : numString)
            numbers[index++] = Integer.parseInt(number);

        Arrays.sort(numbers);
        for(int i : numbers)
            System.out.print(i+" ");

        sc.close();
    }
}
