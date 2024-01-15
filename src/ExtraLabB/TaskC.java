package ExtraLabB;

public class TaskC {
    public static void main(String[] args) {
        int[] numbers = Input.intArray();
        boolean check = checkNum(numbers);
        System.out.println(check);
    }

    static boolean checkNum(int[] numbersIn){
        boolean check = true;
        for(int i = 0; i < numbersIn.length-1; i++){
            if(numbersIn[i] != numbersIn[i+1]){
                check = false;
            }
        }

        return check;
    }
}
