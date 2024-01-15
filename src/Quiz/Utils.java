package Quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
    public static int count(int[] d, int x){
        int count = 0;
        for(int number : d){
            if(number == x){
                count++;
            }
        }
        return count;
    }

    public static int mode(int[] d){
        int mode = 0;
        int maxCount = 0;

        for(int i = 0; i < d.length-1; i++){
            int currentCount = count(d,d[i]);

            if(currentCount > maxCount){
                maxCount = currentCount;
                mode = d[i];
            }
        }

        return mode;
    }

    public static boolean majority(int[] d){
        int mode = mode(d);
        for(int i = 0; i < d.length; i++){
            if(d[i] != mode){
                if(count(d,mode) == count(d,d[i])){
                    return false;
                } 
            }
        }

        return true;
    }

    public static void displayArr(int[] arr){
        int i = 1;
        System.out.print("\n{ ");
        for(int number : arr){
            System.out.print(number);
            if(!(i++ == arr.length)){
                System.out.print(",");
            }
        }
        System.out.println(" }");
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            try{
                int size;
                do{
                    System.out.print("Enter a size: ");
                    size = sc.nextInt();

                    if(size <= 1)
                        throw new InvalidSizeException("The size of your number is less than 1\n");

                } while(size <= 1);

                int[] number = new int[size];
                for(int i = 0; i < size; i++){
                    while(true){
                        try{
                            System.out.print("Enter number "+(i+1)+" : ");
                            number[i] = sc.nextInt();
                            break;
                        } catch(InputMismatchException e){
                            System.out.println("\nIncorrect information Please correct integer.");
                            sc.nextLine();
                        }
                    }
                }

                int mode = mode(number);
                int modeCount = count(number,mode);

                if(majority(number)){
                    displayArr(number);
                    System.out.println("The mode "+mode+" has a number = "+modeCount);
                    System.out.println("The mode is a number = "+mode);

                }
                else {
                    displayArr(number);
                    System.out.println("Not mode!");
                }

            } catch(InputMismatchException e){
                System.out.println("Invalid input. Please enter a valid integer size\n");
                main(args);
            } catch(InvalidSizeException e){
                System.out.println(e.getMessage());
                main(args);
            }
        }
    }
}


class InvalidSizeException extends Exception{
    public InvalidSizeException(String message){
        super(message);
    }
}
