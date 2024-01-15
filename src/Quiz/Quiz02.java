package Quiz;

import java.util.Scanner;

public class Quiz02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String[] data = name.split(" ");

        System.out.println(data.length+" words");
        for(int i = 0; i<data.length; i++){
            System.out.println(data[i]+" "+data[i].length());
        }

        sc.close();
    }
}
