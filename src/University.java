public class University {
    public Student[] student;
    private int count = 0;

    public University(int n) {
        student = new Student[n];
    }

    public void add(Student s) {
        if (count < student.length) {
            student[count] = s;
            count++;
        } else
            System.out.println("FULL");
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(student[i]);
        }
    }

    public void calGradeAllStu() {
        for (int i = 0; i < count; i++) {
            student[i].calGrade();
        }
    }

    public int search(String n) {
        for (int i = 0; i < count; i++) {
            if (student[i].getName().equals(n))
                return i;
        }
        return -1;
    }

    public int UGCount() {
        int num = 0;
        for (int i = 0; i < count; i++) {
            if (student[i] instanceof Undergrad)
                num++;
        }
        return num;
    }

    public int PGCount() {
        int num = 0;
        for (int i = 0; i < count; i++) {
            if (student[i] instanceof Graduate)
                num++;
        }
        return num;
    }

    public int passCount() {
        int num = 0;
        for (int i = 0; i < count; i++) {
            if (student[i].getGrade().equals("pass"))
                num++;
        }
        return num;
    }

    public int failCount() {
        int num = 0;
        for (int i = 0; i < count; i++) {
            // ถ้าเป็น pass จะ true แต่เจอ not จึงเป็น false 
            if (!(student[i].getGrade().equals("pass")))
                num++;
        }
        return num;
    }
    // public void delete(Student s){
    //
    // }
}