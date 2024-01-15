package Term1.Quiz;

import java.util.Scanner;

public class Quiz14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        String[] name = new String[k];
        int[] mark = new int[k];

        for(int i = 0; i<k; i++){
            name[i] = sc.next();
            mark[i] = sc.nextInt();
        }

        int age = age(mark,k);
        int[] indexName = maxMark(mark,name,age);

        // print ชื่อคนที่คะแนน >= ค่าเฉลี่ย
        for(int i = 0; i<indexName.length; i++){
            System.out.println(name[indexName[i]]);
        }

        sc.close();
    }

    // หาค่าเฉลี่ย
    private static int age(int[] markIn,int kIn){
        int age = 0;
        for(int i = 0; i<markIn.length; i++){
            age+=markIn[i];
        }

        return age/kIn;
    }

    //หาตำแหน่ง index ของคนที่คะแนนมากกว่าหรือเท่ากับค่าเฉลี่ย
    private static int[] maxMark(int[] markIn , String[] nameIn , int age ){
        //เรียกMethodที่กำหนดขนาด
        int[] indexName = new int[numIndex(markIn,age)];
        int count = 0;
        for(int i = 0; i<markIn.length; i++){
            // เช็คว่า คะแนนใคร >= age
            if(markIn[i] >= age ){
                // ให้ตัวแปรนี้มารับค่าตำแหน่ง index ของคนที่ คะแนน >= age
                indexName[count] = i; 
                count++;
            }
        }

        return indexName;
    }

    // กำหนดขนาด array ที่เก็บ index ของคนที่คะแนนมากกว่าค่าเฉลี่ย
    private static int numIndex(int[] markIn, int age){
        int count = 0;
        for(int i = 0; i<markIn.length; i++){
            if(markIn[i] >= age){
                count++;
            }
        }

        return count;
    }


}
