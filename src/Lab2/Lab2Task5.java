package Lab2;
// public class Lab2Task5 {
//     public static void main(String[] args) {
//         final int  MAX = 20;
//         //final int MIN = 10;
//         int num = 15;


//         // System.out.println("---------------- 1 -----------------");
//         // while(num<MAX){
//         //     System.out.println(num);
//         //     num++;
//         // }
        
//         /*
//         15
//         16
//         17
//         18
//         19
//          */

//         // System.out.println("---------------- 2 -----------------");
//         // while(num<MAX){
//         //     num = num + 1;
//         //     System.out.println(num);
//         // }

//           /*
//           16
//           17
//           18
//           19
//           20
//            */
        
//         // System.out.println("---------------- 3 -----------------");
//         // for(int i = 1; i <= 20; i+=4){
//         //     System.out.println(i);
//         // }
        
//         /*
//         1
//         5
//         9
//         13
//         17
//          */

//         // System.out.println("---------------- 4 -----------------");
//         // while(num<MAX){
//         //     System.out.println(num);
//         //     num+=2;
//         // }

//         /*
//         15
//         17
//         19
//          */

//         // System.out.println("---------------- 5 -----------------");
//         // while(num<MAX){
//         //     if(num%2 == 0) System.out.println(num);
//         //     num++;
//         // }

//         /*
//         16
//         18
//          */

//         System.out.println("---------------- 6 -----------------");
//         for(int  i = num; i <= MAX; i++)
//             if(i%4 != 0) System.out.println(i);

//         /*
//         15
//         17
//         18
//         19
//          */
//     }
// }

import java.util.Scanner;
public class Lab2Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            end = ask(scanner);
        }
        System.out.println("Good night.");
    }


    private static boolean ask(Scanner s) {
        String menu = getMenu();
        System.out.println(menu);
        System.out.print("What's your next meal?");
        int choice = s.nextInt();
        boolean shouldEnd = false;
        switch (choice) {
            case 1:
                System.out.println("Fried eggs on toast");
                break;
            case 2:
                System.out.println("Pad gra pao moo");
                break;
            case 3:
                System.out.println("Pizza trois fromage");
                break;
            case 4:
                shouldEnd = true;
        }
        return shouldEnd;
    }


    private static String getMenu() {
        String menu = "----\nMenu\n----\n"
                + "1. Breakfast\n2. Lunch\n"
                + "3. Dinner\n4. Sleep";
        return menu;
    }
}
