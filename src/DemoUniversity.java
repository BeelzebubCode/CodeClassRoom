import java.util.Scanner;

class DemoUniversity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        University nu = new University(20);
        System.out.println("Student imput format: U/P Antony 25 36 78");
        for (int i = 0; i < 3; i++) {
            Student stu = getStudent(in);
            nu.add(stu);
        }
        nu.calGradeAllStu();
        nu.print();
    }

    static Student getStudent(Scanner in) {

        String record = in.nextLine();
        String[] str = record.split(" ");
        Student student = null;
        if (str[0].equals("U")) {
            student = new Undergrad(str[1]);
            for (int i = 2; i <= 4; i++) {
                student.setTestScore(i - 1, Integer.parseInt(str[i]));
            }
        } else if (str[0].equals("P")) {
            student = new Graduate(str[1]);
            for (int i = 2; i <= 4; i++) {
                student.setTestScore(i - 1, Integer.parseInt(str[i]));
            }
        }
        return student;
    }
}// class