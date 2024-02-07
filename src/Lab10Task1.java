public class Lab10Task1 {
    public static void main(String[] args) {
        Student stu;
        //stu = new Student();
        stu = new Graduate("Dang");
        stu.calGrade();
        System.out.println(stu);
        stu = new Undergrad("Man");
        stu.calGrade();
        System.out.println(stu);
    }
}
