package ExtraLabB;

import java.util.Arrays;
import java.util.Comparator;

public class TaskG2 {
    public static void main(String[] args) {
        int[][] drawYX = new int[4][2];

        for(int i = 0; i < 4; i++){
            int[] number = Input.intArray();
            for(int j = 0; j < number.length; j++){
                drawYX[i][j] = number[j];
            }
        }

        int maxX = maxX(drawYX);
        Arrays.sort(drawYX, Comparator.comparingInt(a -> a[1]));
        String result = drawYX(drawYX,maxX);

        System.out.println(result);
    }

    static int maxX(int[][] drawYX){
        int max = Integer.MIN_VALUE;
        final int X = 1;
        for(int i = 0; i < drawYX.length; i++){
            if(drawYX[i][X] > max){
                max = drawYX[i][X];
            }
        }

        return max;
    }

    static String drawYX(int[][] drawYX, int maxX){
        String newDrawYX = "";
        for(int i = 0; i < maxX; i++){
            for(int j = 0; j < maxX; j++){
                boolean isX = false;
                
                for(int x = 0; x < 4; x++){
                    if(drawYX[x][1] == i+1 && drawYX[x][0] == j+1){
                        isX = true;
                        newDrawYX+="x";
                        break;
                    } 
                }

                if(!isX){
                    newDrawYX+=".";
                }
            }
            newDrawYX+="\n";
        }

        return newDrawYX;
    }
}

