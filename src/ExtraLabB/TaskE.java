package ExtraLabB;

public class TaskE {
    public static void main(String[] args) {
        String[] message = Input.stringArray();
        messageLong(message);
    }

    static void messageLong(String[] word){ 
        for(int i = 0; i < word.length; i++){
            if(word[i].length() > 6)
                System.out.println(word[i]);
        }
    }
}
