package Term1.Quiz;

import java.util.Scanner;

public class Quiz04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n แทนความกว้าง
        int n = sc.nextInt();

        // m แทนความยาว
        int m = sc.nextInt();

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
