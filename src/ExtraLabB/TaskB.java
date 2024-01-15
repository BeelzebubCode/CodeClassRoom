package ExtraLabB;

public class TaskB {
    public static void main(String[] args) {
        String[] words = Input.stringArray();
        String result = longWord(words);
        System.out.println(result);
        }
        
    static String longWord(String[] wordIn){
        String longWord = " ";
        for(int i = 0; i < wordIn.length; i++){
            if(wordIn[i].length() >= 6){
                longWord = wordIn[i];
                break;
            }
        }

        return longWord;
    }

}
