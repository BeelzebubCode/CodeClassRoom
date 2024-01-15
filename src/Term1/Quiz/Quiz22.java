package Term1.Quiz;
import java.util.Scanner;

public class Quiz22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] student = new int[n];
        for (int i = 0; i < n; i++) student[i] = i+1;

        // นับจำนวนคนออก, เอาไว้บวก index ในกรณีเจอ -1(ออกไปแล้ว), เป็น index จากรอบแล้ว เวลากลับมาลูปจะได้เริ่มต่อกัน
        int outCount = 0, plusIndex = 0, lastIndex=0;
        // ตัวชี้ array, ตัวนับเลข
        int index, num;
        // ลูปจนคนออกครบ n คน
        while(outCount<n){
            //ให้ตัวนับเป็น 0 ตัวบวกตอนข้ามเป็น 0
            num = 0;
            plusIndex = 0;
            // ลูปจนนับครบ k ครั้ง
            while(num<k){
                // สูตรหาตัวชี้ ถ้าเกินจะปัดมาข้างหน้า
                index = (num+plusIndex+lastIndex)%n;
                System.out.println("num = " + num + " plusIndex = " + plusIndex + " lastIndex = " + lastIndex + " index = " + index);
                // ถ้าเจอคนที่ออกไปแล้ว(-1) ให้นับข้าม
                if(student[index] == -1) {
                    plusIndex++;
                    continue;
                } 
                // ถ้าไม่เจอคนที่ออกให้นับ
                else num++;
            }

            //คิด index ใหม่
            index = (num-1+plusIndex+lastIndex)%n;
            // print
            System.out.println(student[index]);
            // ให้ตำแหน่งนั้นคือออกไปแล้ว
            student[index] = -1;
            // นับคนออก
            outCount++;
            // ใส่ last index เป็นตัวถัดไป
            lastIndex = index+1;

            sc.close();
        }
    }
}
