package Term1.Quiz;

public class Quiz27 {
    public static void main(String[] args) {
        String names[] ={"Tawin","Ant","Tong","Mam","Kium","Sanya"};
        int money[] = {100,500,250,550,120,430};
        System.out.println("The Richest is "+richest(names, money));
    }

    static String richest(String[] nameIn , int[] moneyIn){

        //ให้วนรอบเท่ากับจำนวนในArray
        for(int i = 0; i<moneyIn.length; i++){

            //วนรอบอีกครั้งเพื่อเรียงจากมากไปน้อย
            // ใส่ length - 1 เพราะไม่ต้องการให้เช็คตัวเอง และกัน index เกิน
            for(int j = 0; j<moneyIn.length-1; j++){

                //เช็คว่าถ้าตัวที่index j < j+1 เราจะย้าย j+1 มาตำแหน่งที่ j (เรียงมากไปน้อย)
                if(moneyIn[j] < moneyIn[j+1]){

                    //ตัวแปลย้าย เพราะจะให้ j = j+1 เราจึงต้องฝากค่าใน j ไว้กับตัวแปรอื่นก่อน
                    int temp = moneyIn[j];
                    moneyIn[j] = moneyIn[j+1];
                    // นำค่าที่ฝากไว้ temp มาตำแหน่งที่ j+1
                    moneyIn[j+1] = temp;

                    // นำสตริงมาเรียงไปพร้อม ชื่อคนที่มีเงินมากสุดจะอยู่ index ที่ 0 เมื่อจบโปรแกรม
                    String move = nameIn[j];
                    nameIn[j] = nameIn[j+1];
                    nameIn[j+1] = move;
                }
            }
        }

        // ส่งชื่อคนที่เงินมากสุดออกไป 
        return nameIn[0];
    }
}
