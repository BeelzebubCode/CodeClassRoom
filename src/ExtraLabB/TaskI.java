package ExtraLabB;

public class TaskI {
    public static void main(String[] args) {
        int[] number = Input.intArray();
        int[] result = removeArray(number);

        int count = 0;
        for(int num : result){
            System.out.print(num);
            if(count++ != result.length-1){
                System.out.print(",");
            }
        }
    }

     static int[] removeArray(int[] number){
        int[] newArray = new int[number.length];
        int count = 0;

        for(int i = 0; i < number.length; i++){
            boolean check = true;
            for(int j = 0; j < count; j++){
                if(number[i] == newArray[j]){
                    check = false;
                    break;
                }
            }

            if(check){
                newArray[count++] = number[i];
            }
        }

        int[] result = new int[count];
        System.arraycopy(newArray, 0, result, 0, count);
        return result;
     }
}
