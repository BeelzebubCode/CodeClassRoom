import java.io.*;
//import java.util.*;
import javax.swing.*;

class DemoUniversityFile {
    static University nu = new University(100);

    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // System.out.print("Data file name: ");
        // String filename = in.nextLine();
        JFileChooser chooser = new JFileChooser();
        int returnVal = chooser.showOpenDialog(null);
        String filename = "";
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            filename = chooser.getSelectedFile().getName();
        }

        if (buildUniversity(filename)) {
            nu.print();
            nu.calGradeAllStu();
            System.out.println("------------ After calculate grade -----------");
            nu.print();
            System.out.println("Number of PostGrad = " + nu.PGCount());
            System.out.println("Number of Undergrad = "+nu.UGCount());
            System.out.println("Number of pass = "+nu.passCount());
            System.out.println("Number of fail = "+nu.failCount());
        }
    }

    private static boolean buildUniversity(String filename) {
        String inputLine;
        Student student;
        File inFile;
        FileReader fileReader;
        BufferedReader bufReader;
        boolean status = true;
        boolean done = false;

        try {
            inFile = new File(filename);
            fileReader = new FileReader(inFile);
            bufReader = new BufferedReader(fileReader);

            while (!done) {
                inputLine = bufReader.readLine(); // read one line
                if (inputLine.equalsIgnoreCase("END")) {
                    done = true;
                } else {
                    student = createStudent(inputLine);
                    if (student != null) {
                        nu.add(student);
                    }
                }
            } // while

            bufReader.close();
        } catch (IOException e) {
            status = false;
        }

        return status;
    }

    static Student createStudent(String record) {
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
}
