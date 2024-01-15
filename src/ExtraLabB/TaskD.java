package ExtraLabB;
public class TaskD {
    public static void main(String[] args) {
        int[] numbers = Input.intArray();
        boolean check = check123(numbers);
        System.out.println(check);
    }

    static boolean check123(int[] numbers){
        boolean check = false;
        if(numbers.length >= 3){
            for(int i = 0; i < numbers.length; i++){
                // i+2 < numbers.length กัน index เกิน
                if(numbers[i] == 1 && i+2 < numbers.length){
                    if(numbers[i+1] == 2){
                        if(numbers[i+2] == 3){
                            check = true;
                        }
                    }
                }
            }
        }
        return check;
    }
}
