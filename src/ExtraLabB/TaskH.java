package ExtraLabB;

import java.util.Arrays;

public class TaskH {
    public static void main(String[] args) {
        String[] char1 = Input.stringArray();
        String[] char2 = Input.stringArray();

        char[] charac1 = copyArr(char1);
        char[] charac2 = copyArr(char2);

        charac1 = sortChar(charac1);
        charac2 = sortChar(charac2);

        charac1 = removeDuplicates(charac1);
        charac2 = removeDuplicates(charac2);

        int i = 0, j = 0;
        while(i < charac1.length && j < charac2.length){
            if(charac1[i] < charac2[j]){
                i++;
            } else if(charac1[i] > charac2[j]){
                j++;
            } else {
                System.out.print(charac1[i]);
                if(!(i > charac1.length-2) && !(j > charac2.length-2)){
                    System.out.print(",");
                }
                i++;
                j++;
            }
        }
    }

    static char[] copyArr(String[] arr){
        char[] copy = new char[arr.length];
        int i = 0;
        for(String str : arr){
            for(char c : str.toCharArray()){
                copy[i++] = c;
            }
        }

        return copy;
    }

    static char[] sortChar(char[] c){
        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < c.length-1; j++){
                if(c[j] > c[j+1]){
                    char temp = c[j];
                    c[j] = c[j+1];
                    c[j+1] = temp;
                }
            }
        }
        return c;
    }

    static char[] removeDuplicates(char[] arr){
        int length = arr.length;
        for(int i = 0; i<length; i++){ 
            for(int j = i+1; j<length; j++){
                if(arr[i] == arr[j]){
                    for(int k = j; k<length-1; k++){
                        arr[k] = arr[k+1];
                    }
                    length--;
                    j--;
                }
            }
        }
        return Arrays.copyOf(arr,length);
    }
}
