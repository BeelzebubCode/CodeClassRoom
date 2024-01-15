package Term1.Quiz;

import java.util.Scanner;

public class Quiz21 {
    public static void main(String[] args) {
        // เกมนับเลข ป้อนจำนวนนักเรียน ป้อนจำนวนเลขที่ต้องนับถึง
        // นักเรียนจะมีเลขที่เรียงตั้งแต่ 1 - คนท้าย
        // แสดงเลขที่นักเรียนที่เดินออกห้อง
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] student = new int[n];
        
        if(n >= 3 && n <=5000)
            if(k >= 1 && k <= 1000000){

                //ให้เลขที่แกนักเรียน 1 - n
                for(int i = 0; i<student.length; i++){
                    student[i] = i+1;
                }

                // count มานับเลข - k และ j เป็น index ของนักเรียน
                int count = 1 , j = 0;
                while(true){
                    // sum เช็ตให้ออก ลูป
                    int sum = 0;
                    boolean check = true;

                    // เช็ค ว่าตำแหน่งนั้นออกไปยัง ถ้าออกให้ index + 1 และหยุดนับตำแหน่งนั้น
                    if(student[j]== 0){
                        count--;
                        j++;
                        if(j > student.length-1) j = 0; 
                        
                        //ไม่ให้นับ index เพิ่มในบรรทัดที่ 51
                        check = false;
                    }

                    if(count==k){
                        System.out.println(student[j]);
                        // print คนที่ออก และให้ตำแหน่งนั้นเป็น 0 พอ sum += ทั้ง Array แล้ว ได้ 0 จะหยุด
                        student[j] = 0;

                        // ให้เริ่มนับใหม่
                        count = 0;
                    }

                    // ถ้าจริงจะเข้าไปเปลี่ยน index
                    if(check){
                        // + index 
                        if(j!=student.length-1) j++;
                        //ให้index = 0 เมื่อนับถึงคนท้าย
                        else j = 0; 
                    }
                    
                    // รวมผลรวม เพื่อออกลูป
                    for(int sumIn = 0; sumIn<student.length; sumIn++){
                        sum+=student[sumIn];
                    }

                    // เช็คว่าทุกคนออกห้องยัง (ถ้าคนที่ออกไปตำแหน่งนั้นจะมีค่าเป็น 0)
                    if(sum==0) break;
                    count++;
                }
            }

            sc.close();
        }
    }

        /*
        input
        5 3
        output
        3
        1
        5
        2
        4
         */

