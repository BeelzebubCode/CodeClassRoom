package ExtraLabB;

public class TaskF {
    public static void main(String[] args) {
        int[] numbers = Input.intArray();
        evenNumber(numbers);
    }

    static void evenNumber(int[] number){
        for(int i = 0; i < number.length; i++){
            if(number[i]%2 != 0){
                System.out.print(number[i]-1+",");
            }
            else {
                System.out.print(number[i]+",");
            }
        }
    }
}
