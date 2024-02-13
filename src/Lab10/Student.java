package Lab10;

abstract public class Student {
    protected final static int NUM_OF_TESTS = 3; // number of Test
    protected String name;          // Student Name
    protected int[] test;           // keep the score test
    protected String grade;         // "pass" or "fail"
    public Student( ) {
        this("No Name");
    }
    public Student(String name) {
        this.name = name;
        test = new int[NUM_OF_TESTS];
        grade = "****";
    }
    public String getGrade( ) {
      return grade;
    }
    public String getName( ) {
      return name;
    }
    public void setName(String name) {
      this.name = name;
    }
    public void setTestScore(int testNumber, int testScore) {
      if(testNumber>=1 && testNumber<=NUM_OF_TESTS)
        test[testNumber-1] = testScore;
      else
        System.out.println("index of test number is out of range");
    }
    public String toString(){
      return name + ", Grade: " + grade;
    }
    abstract public void calGrade();
}