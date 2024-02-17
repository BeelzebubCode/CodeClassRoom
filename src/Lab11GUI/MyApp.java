package Lab11GUI;

import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.*;

class MyApp extends JFrame implements ActionListener{
    final JLabel resultLabel;

    public MyApp(){
        setTitle("My Application");
        setSize(300,200);
        setLocation(10,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        final JLabel label = new JLabel("Hey Priscilla");
        getContentPane().add(label);

        final JButton button = new JButton("Yes Flash?");
        getContentPane().add(button);
        button.addActionListener(this);

        final JButton punchButton = new JButton("Punch");
        punchButton.setActionCommand("punch");
        punchButton.addActionListener(this);
        getContentPane().add(punchButton);

        resultLabel = new JLabel("");
        getContentPane().add(resultLabel);
    }

    public void actionPerformed(ActionEvent e){
        // resultLabel.setText("What do you call a three humped camel?");
        JButton button = (JButton) e.getSource();
        if(button.getActionCommand().equals("punch")){
            resultLabel.setText("Pregant!");
        }
        else {
            resultLabel.setText("What do you call a three humped camel?");
        }
    }

    public static void main(String[] args) {
        MyApp app = new MyApp();
        app.setVisible(true);

        
    }
}
// public class MyApp {
//     public static void main(String[] args) {
//         JFrame frame = new JFrame();
//         frame.setTitle("My Application");
//         frame.setSize(300,200);
//         frame.setLocation(10,200);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setVisible(true);
//     }
// }
