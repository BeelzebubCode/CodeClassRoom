package Test;


class Test {
    public static void main(String[] args) {
        //int z = 0, x = -10;
        // if(z == 0 | x/z > 20){
        //     System.out.println("Hello world");
        // }
        
        // if(x>=0 & Math.sqrt(x)<15.0){

        // }


        // int x = 5, y = 8;
        // int n = 4;
        // if(n<5)
        //     if(n>3)
        //     System.out.println("Hi");
        // else
        //     System.out.println("Bye");
        
        // // ? = if  : = else
        // int compare = (x>y) ? 1:((x<y) ? -1:0);
        // System.out.println("compare = "+compare);

        // Scanner sc = new Scanner(System.in);

        // while(true){
        //     String message = sc.next();
        //     if(message.equals("*")) break;
        // }

        // int a2[][];
        // a2 = new int[4][];
        // System.out.println(a2[3].length);

        int[] a = {1,2,3,4,5,6};
        int[] b = {7,8,9,10,11};

        System.out.println(a);
        System.out.println(b);

        b = a;
        System.out.println(b);

        b[2] = 20;
        System.out.println(a[2]);
    }
}