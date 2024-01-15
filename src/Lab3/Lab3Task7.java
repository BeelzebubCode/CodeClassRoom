package Lab3;
import java.util.Scanner;

public class Lab3Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 1;
        String[] data = new String[size];

        System.out.println("Enter a list of items: ");
        int index = 0;
        while(true){
            String message = sc.next();
            if(message.equals("*")) break;
            if(index >= size){
                data = reSize(data,index+1);
                // เพิ่มขนาดของ array
            }
            data[index] = message;
            index++;
        }

        int center = data.length/2;
        if(data.length%2 == 0){
            System.out.println(data[center-1]);
            System.out.println(data[center]);
        }
        else {
            System.out.println(data[center]);
        }

        sc.close();
    }

    static String[] reSize(String[] data, int size){
        String[] newData = new String[size];
        //(arrayที่ต้องการcope , ตำแหน่งที่เริ่มต้นที่cope , arrayที่ต้องการลง , ตำแหน่งที่ลง , ทำกี่ครั้ง)
        System.arraycopy(data, 0, newData, 0, data.length);
        return newData;
    }
}
