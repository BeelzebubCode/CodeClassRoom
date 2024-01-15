package Term1.Lab5;

public class Task1P2 {
    public static void main(String[] args) {

        int x = 3;
        int y = 3;
        System.out.println(myMethod(x, y));
        System.out.println(y);

    }

    private static int myMethod(int firstIn, int secondIn) {
        int x = 10;
        int y;
        y = x + firstIn + secondIn;
        return y;
    }
}
