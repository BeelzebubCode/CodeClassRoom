package MiniTest;
import javax.swing.*;
import java.awt.*;

public class MT3aTask1 extends JFrame{

    public MT3aTask1(){
        setTitle("Window");
        setSize(300, 200);

        setLayout(new GridLayout(2, 2));

        JButton buttonA = new JButton("A");
        JButton buttonB = new JButton("B");
        JButton buttonC = new JButton("C");

        getContentPane().add(buttonA);
        getContentPane().add(buttonB);
        getContentPane().add(buttonC);
    }
    public static void main(String[] args) {
        MT3aTask1 app = new MT3aTask1();
        app.setVisible(true);
    }
}
