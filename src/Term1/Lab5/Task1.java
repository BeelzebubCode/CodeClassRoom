package Term1.Lab5;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(myMethod(3,5,10));
        System.out.println(myMethod(3,1));
    }

    private static int myMethod(int firstIn, int secondIn, int thirdIn){
        return firstIn+secondIn+thirdIn;
    }

    private static int myMethod(int firstIn, int secondIn){
        return firstIn+secondIn;
    }
}
