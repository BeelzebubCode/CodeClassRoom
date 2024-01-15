package Lab5;
public class Fraction {
    private int top, bottom;

    public Fraction(int top, int bottom){
        this.top = top;
        this.bottom = bottom;
    }

    public int getTop(){
        return top;
    }

    public void setTop(int top){
        this.top = top;
    }

    public int getBottom(){
        return bottom;
    }

    public void setBottom(int bottom){
        this.bottom = bottom;
    }

    public String toString(){
        return top+"/"+bottom;
    }

    public double toDouble(){
        return (double)top / bottom;
    }

    public boolean equals(Fraction fracIn){
        return top == fracIn.getTop() && bottom == fracIn.getBottom(); 
    }

    private static int gcd(int a, int b){
        if(b == 0) 
            return Math.abs(a);
        return gcd(b, a%b);
    }

    public void simplify(){
        int gcd = gcd(top,bottom);
        top/=gcd;
        bottom/=gcd;
    }

    public Fraction multiply(Fraction frac){
        // int newTop = getTop() * frac.getTop();
        // int newBottom = getBottom() * frac.getBottom();
        //Fraction newFrac = new Fraction(getTop()*frac.getTop(),getBottom()*frac.getBottom());
        return new Fraction(getTop()*frac.getTop(),getBottom()*frac.getBottom());
    }

    public Fraction add(Fraction frac){    
        if(getBottom() == frac.getBottom()){
            return new Fraction(getTop() + frac.getTop(), getBottom());
        }
        int newBottom = getBottom() * frac.getBottom();
        int newTop = (getTop() * frac.getBottom()) + (frac.getTop() * getBottom());

        return new Fraction(newTop, newBottom);
    }

    public static Fraction parse(String input){
        String[] strFrac = input.split("/");
        int[] frac = new int[strFrac.length];

        int i = 0;
        for(String str : strFrac){
            int fracNum = Integer.parseInt(str);
            frac[i++] = fracNum;
        }
        return new Fraction(frac[0], frac[1]);
    }

    public Fraction subtract(Fraction frac){
        if(getBottom() == frac.getBottom()){
            return new Fraction(getTop() - frac.getTop(), getBottom());
        }

        return new Fraction((getTop() * frac.getBottom()) - (frac.getTop() * getBottom()), getBottom() * frac.getBottom());
    }
}

    // public Fraction multiply(int number){
    //     int newTop = getTop() * number;
    //     Fraction newFrac = new Fraction(newTop,getBottom());
    //     newFrac.simplify();
    //     return newFrac;
    // }