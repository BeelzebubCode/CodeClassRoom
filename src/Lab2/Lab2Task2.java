package Lab2;
public class Lab2Task2 {
    public static void main(String[] args) {
        
        for(int i = 1; i<=100; i++){
            if(i%3 == 0 && i%5 != 0) {
                System.out.print("Fizz, ");
                continue;
            }
            if(i%5 == 0 && i%3 != 0) {
                System.out.print("Buzz, ");
                continue;
            }
            if(i%3 == 0 && i%5 == 0) {
                System.out.print("FizzBuzz, ");
                continue;
            }
            System.out.print(i+", ");
        }
    }
}
