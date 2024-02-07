import java.util;
public class Die{
private Random generator;
private int sides;
private int castNumber;
public Die(int sides){
sides = s;
generator = new Random();
castNumber = 0;
}
public int cast(){
castNumber = 1 + generator.nextInt(sides);
return castNumber;
}
public double getMeasure(){
return castNumber;
}
}
