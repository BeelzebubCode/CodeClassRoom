package Term1.Lab4;

public class Task6 {
    public static void main(String[] args){
        int i = 1;

        System.out.print("Output : ");
        while(i<=9){
            if(i%2 != 0){
                System.out.print("B ");
                i++;
                continue;
            }
            System.out.print("A ");
            i++;
        }
    }
}
