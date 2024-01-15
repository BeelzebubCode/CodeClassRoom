package ExtraLabB;
public class TaskA {
    public static void main(String[] args) {
        int[] numbers = Input.intArray();
        int result = sum(numbers);
        System.out.println(result);
    }

    public static int sum(int[] numbers) {
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum+=numbers[i];
        }
        return sum;
    }
}
