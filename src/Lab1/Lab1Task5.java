package Lab1;
public class Lab1Task5 {
    public static void main(String[] args) {
        
        int number = 0;
        if(args.length == 2){
            try{

                number = Integer.parseInt(args[1]);

            } catch(NumberFormatException e){
                System.err.println("Argument " + args[1] + " must be an integer.");
        		System.exit(1);
            }
        }
        else {
            System.out.println("You must have 2 argument.");
            System.exit(1);
        }
    
        for(int i = 1; i <= number; i++){
            System.out.print(args[0]+" ");
        }
    }
}
