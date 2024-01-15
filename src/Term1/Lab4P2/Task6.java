package Term1.Lab4P2;

public class Task6 {
    public static void main(String[] args) { 
        // output B  A  B  B  A  B  B  A  B  B  A  B  B  A  B  B  A  B  B  A  B

        for (int i = 20; i >= 0; i--) { 
           if ((i+2) % 3 == 0) {  
                System.out.print("A"+" ");
           } 
           else {  
                System.out.print("B"+" ");
           } 
  
        } 
  
    }
}
