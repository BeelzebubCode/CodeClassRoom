package ExtraLabB;

public class TaskG {
    public static void main(String[] args) {
        int[] draw = Input.intArray();
        int maxX = maxX(draw);
        int[] X = drawX(draw);
        int[] Y = drawY(draw);
        
        System.out.println(makeDraw(X, Y, maxX));
    }

    // วาดรูป
    static String makeDraw(int[] X, int[] Y, int maxX){
        String draw ="";
        for(int i = 0; i < maxX; i++){
            for(int j = 0; j < maxX; j++){
                // สร้างตัวแปรมาไว้เช็คว่าแถวคอลัมนั้นมี X
                boolean isX = false;

                // ลูปตรวจสอบ X และทำ X
                for(int k = 0; k < X.length; k++){
                    if(X[k] == i+1 && Y[k] == j+1){
                        draw+="x";
                        isX = true; // แจ้งว่าแถวคอลัมนี้มี X
                        break;
                    }
                }
                // เช็คว่าในแถวนี้คอมลัมนี้มี X ไหม
                if(!isX){
                    draw+=".";
                }
            }
            draw+="\n";
        }
        return draw;   
    }
    
    // หาจำนวนแถวที่มากสุด
    static int maxX(int[] drawXY){
        int maxX = Integer.MIN_VALUE;
        for(int i = 0; i < drawXY.length; i++){
            if(i%2 != 0){
                if(drawXY[i] > maxX)
                    maxX = drawXY[i];
            }
        }
        return maxX;
        
    }

    // เก็บค่าแถวที่มีคอลัม
    static int[] drawX(int[] draw){
        int[] drawX = new int[draw.length/2];
        for(int i = 1, k = 0; i < draw.length; i+=2){
            drawX[k++] = draw[i];
        }
        return drawX;
    }

    // เก็บค่าตำแหน่งคอลัม
    static int[] drawY(int[] draw){
        int[] drawY = new int[draw.length/2];
        for(int i = 0, k = 0; i < draw.length; i+=2){
            drawY[k++] = draw[i];
        }
        return drawY;
    }
}

