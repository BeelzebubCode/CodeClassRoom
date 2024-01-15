package Lab4;

public class Lab4Task5 {
    public static void main(String[] args) {
        Person personA = new Person("Andrew",12);
        Person personB = new Person("Beryl",12);
        Person personC = new Person("Andrew",12);

        if(personA.equals(personB)){
            System.out.println("A and B are the same.");
        }
        if(personA.equals(personC)){
            System.out.println("A and C are the same.");
        }
        else{
            System.out.println("Hi");
        }
        
    }
}
