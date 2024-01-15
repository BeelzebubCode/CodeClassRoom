package Term1.Quiz;

import java.util.Scanner;
public class Quiz16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        String[] name = new String[k];
        int[] mark = new int[k];
        double sum = 0;

        for(int i = 0; i<k; i++){
            name[i] = sc.next();
            mark[i] = sc.nextInt();
            sum+=mark[i];
        }

        double age = sum/k;

        Sorted(mark,name);

        for(int i = 0; i<k; i++){
            if(mark[i] >= age){
                System.out.println(name[i]);
            }
        }
        sc.close();
    }

    //เมธอดรับค่า mark
    static void Sorted(int[] Data, String[] name){
        //สร้างตัวแปร length loopจะได้ไม่งง
        int length = Data.length;
        for(int i=0; i<length-1; i++){
            for(int j=0;j<length-1;j++){
                if(Data[j+1]>Data[j]){
                    // สลับค่าในข้อมูลจริง
                    int tempInt = Data[j];
                    Data[j] = Data[j+1];
                    Data[j+1] = tempInt;
                    // สลับค่าในอาเรย์สำหรับชี้อินเด็กซ์เพื่่อเรียง
                    
                    String tempString = name[j];
                    name[j] = name[j+1];
                    name[j+1]  = tempString;
                }
            }   
        }
        
    }
}
