package Lab2;
public class Lab2Task3 {
    public static void main(String[] args) {
        
        final int MAX = 25, LIMIT = 100;
        int num1 = 12, num2 = 25, num3 = 87;

        System.out.println("------------ 1 ------------");
        if(num1 < MAX)
        System.out.println("apple"); // apple
        
        System.out.println("------------ 2 ------------");
        if(num2 <= MAX)
            System.out.println("apple");
        System.out.println("orange");

        /*
         apple
         orange
         */

        System.out.println("------------ 3 ------------");
         if(num3 >= LIMIT)
            System.out.println("apple");
            System.out.println("orange");
        System.out.println("pear");

        /*
         orange
         pear
         */

        System.out.println("------------ 4 ------------");
         if(num2 == MAX){
            System.out.println("apple");
            System.out.println("orange");
         }
         System.out.println("pear");

         /*
          apple
          orange
          pear
          */

        System.out.println("------------ 5 ------------");
        if(num1 < MAX)
            if(LIMIT >= num2)
                System.out.println("apple");
        System.out.println("orange");

        /*
        apple
        orange
         */

         System.out.println("------------ 6 ------------");
         if(num2 > 18)
            if(num1 < 0)
                System.out.println("apple");
            else 
                System.out.println("orange");
        System.out.println("pear");

        /*
        orange
        pear
         */

        // System.out.println("------------ 7 ------------");
        // if(LIMIT >= 5 * num2)
        //     if(MAX == 25)
        //         System.out.println("apple");
        //     else 
        //         System.out.println("orange");
        // else 
        //     System.out.println("pear");

        /*
        pear
         */

        // System.out.println("------------ 8 ------------");
        // if((num3 == 87 || num2 > num1) && MAX > LIMIT)
        //      System.out.println("apple");
        // System.out.println("orange");

        /*
        orange
         */


    }
}
