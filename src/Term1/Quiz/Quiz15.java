package Term1.Quiz;

import java.util.Scanner;
public class Quiz15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        String[] name = new String[k];
        int[] mark = new int[k];
        //sum เอาไว้เก็บคะแนนรวม
        double sum = 0;
        for(int i = 0; i<k; i++){
            name[i] = sc.next();
            mark[i] = sc.nextInt();
            //ใส่ค่าคะแนนที่เก็บมาบวกรวมไว้
            sum+=mark[i];
        }
        //หาค่าเฉลี่ย
        double age = sum/k;

        mark=sortMark(mark);
        name=sortName(mark,name);

        for(int i = 0; i<mark.length; i++){
            if(mark[i] >= age){
                System.out.println(name[i]);
            }
        }
        sc.close();
    }

    private static int[] sortMark(int[] markIn){
       
        for(int i = 0; i<markIn.length; i++){
            for(int j = 0; j<markIn.length-1; j++){

                if(markIn[j] > markIn[j+1]){
                    int deposit = markIn[j];
                    markIn[j] = markIn[j+1];
                    markIn[j+1] = deposit;
                }
            }
        }
        return markIn;
    }

     private static String[] sortName(int[] markIn , String[] nameIn){
        // String[] nameIn = name;
        for(int i = 0; i<markIn.length; i++){
            for(int j = 0; j<markIn.length-1; j++){

                if(markIn[j] > markIn[j+1]){
                    String temp = nameIn[j];
                    nameIn[j] = nameIn[j+1];
                    nameIn[j] = temp;
                }
            }
        }

        return nameIn;
    }

}