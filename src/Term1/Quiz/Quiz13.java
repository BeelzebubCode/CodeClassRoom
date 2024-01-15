package Term1.Quiz;

import java.util.Scanner;

public class Quiz13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lim = sc.nextInt();
        int[] numberA = new int[lim];
        
        for(int i = 0; i<numberA.length; i++){
            numberA[i] = sc.nextInt();
        }
        // print Arrat เริ่มต้นออกมาดู
        displayArray(numberA);

        // นำArrayไปเรียงลำดับจากมาก=>>น้อย
        numberA = maxSort(numberA);
        displayArray(numberA);

        // นำArrayไปเรียงลำดับจากน้อย=>>มาก
        numberA = minSort(numberA);
        displayArray(numberA);

        sc.close();
    }

    private static void displayArray(int[] numberIn){
        System.out.print("{");
        for(int i = 0; i<numberIn.length; i++){
            System.out.print(numberIn[i]+"");
            if(i<numberIn.length-1){
                System.out.print(",");
            }  
        }
        System.out.print("}\n");
    }

    private static int[] maxSort(int[] arr){

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length-1; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }

    private static int[] minSort(int[] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }
}
