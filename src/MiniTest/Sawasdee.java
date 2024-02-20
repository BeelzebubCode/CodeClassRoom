package MiniTest;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sawasdee extends JFrame implements ActionListener{
    JButton btn;
    JTextField text;

    public Sawasdee(){
        setSize(300, 100);
        setTitle("Hi GUI");
        setLayout(new FlowLayout());

        text = new JTextField();
        text.setPreferredSize(new Dimension(150, 30));
        btn = new JButton("Hi");
        btn.addActionListener(this);

        getContentPane().add(text);
        getContentPane().add(btn);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        // JButton btn1 = (JButton) e.getSource();
        if(e.getSource() == btn){
            text.setText("Sawasdee");
        }
    }
    public static void main(String[] args) {
        Sawasdee hi = new Sawasdee();
        hi.setVisible(true);
    }
}
