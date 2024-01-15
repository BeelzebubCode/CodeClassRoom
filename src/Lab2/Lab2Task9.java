package Lab2;
public class Lab2Task9 {
    public static void main(String[] args) {
        String z = grade(60);
        System.out.println(z);
    }

    static String grade(int score){
        String zIn;
        if(score >= 80) zIn = "A";
        else if(score >= 75 && score <= 79) zIn = "B+";
        else if(score >= 70 && score <= 74) zIn = "B";
        else if(score >= 65 && score <= 69) zIn = "C+";
        else if(score >= 60 && score <= 64) zIn = "C";
        else if(score >= 55 && score <= 59) zIn = "D+";
        else if(score >= 50 && score <= 54) zIn = "D";
        else zIn = "F";

        return zIn;
    }
}
