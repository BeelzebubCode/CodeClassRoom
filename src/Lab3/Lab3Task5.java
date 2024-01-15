package Lab3;
public class Lab3Task5 {
    public static void main(String[] args) {

        int[] numbers = { 5, 9, 12, 7, 14, 3, 2 };
        int[] numbers5 = arrayPlus(numbers, 5);
        for (int i = 0; i < numbers5.length; i++) {
            System.out.print(numbers5[i] + ", ");
        }
        System.out.println();
        
        int[] numbers10 = arrayPlus(numbers, 10);
        for (int i = 0; i < numbers10.length; i++) {
            System.out.print(numbers10[i] + ", ");
        }
        System.out.println();
    }

    static int[] arrayPlus(int[] numberIn, int x){
        int[] number = new int[numberIn.length];
        for(int i = 0; i < numberIn.length; i++){
            number[i] = numberIn[i] + x;
        }

        return number;
    }
}
