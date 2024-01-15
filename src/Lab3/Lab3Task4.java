package Lab3;
public class Lab3Task4 {
    public static void main(String[] args) {

        String[] hello = { "Hello", "Jeremy" };
        System.out.println(last(hello)); // prints "Jeremy"
        String[] empty = {};
        System.out.println(last(empty)); // prints "null"
    }

    static String last(String[] message){
        if(message.length > 0) return message[message.length-1];
        return null;
    }
}
