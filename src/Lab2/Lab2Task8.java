package Lab2;
public class Lab2Task8 {
    public static void main(String[] args) {
        int x = myDouble(4);
        System.out.println(x);
        float y = smallest(4.8f, 1.2f, 2.4f);
        System.out.println(y);
        char z = last("programming");
        System.out.println(z);
    }

    static int myDouble(int n){
        return n*2;
    }

    static float smallest(float x , float y, float z){
        double min = Math.min(x,Math.min(y,z));
        return (float)min;
    }

    static char last(String message){
        return message.charAt(message.length()-1);
    }
}
