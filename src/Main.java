import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PlayerWarrior p = new PlayerWarrior("pong", "sword", 100);
        System.out.print("Enter damage: ");
        double damage = sc.nextDouble();
        
        sc.close();
    }
}
