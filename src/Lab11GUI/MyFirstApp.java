package Lab11GUI;

import javax.swing.*;
import java.awt.*;

public class MyFirstApp extends JFrame{
    public MyFirstApp(){
        setTitle("my first app");
        setSize(400,100);
        setLocation(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        final JLabel l1 = new JLabel("Hello");
        getContentPane().add(l1);
        final JButton b1 = new JButton("Yes");
        getContentPane().add(b1);
        final JButton b2 = new JButton("No");
        getContentPane().add(b2);
        final JLabel l2 = new JLabel("I'm OK!");
        getContentPane().add(l2);
        setVisible(true);
    }
    public static void main(String[] args) {
        new MyFirstApp();
    }
}
