package MiniTest;
import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class MT3aTask2 extends JFrame implements ActionListener{
    private JButton button;

    public MT3aTask2(){
        setTitle("Switch");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        button = new JButton("ON");
        button.setActionCommand("on");
        // button.setBounds(200, 100, 300, 200);
        button.setFocusable(false);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.CENTER);       
        button.setPreferredSize(new Dimension(300, 200));

        getContentPane().add(button);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btnCheck = (JButton) e.getSource();
        if(btnCheck.getActionCommand().equals("on")){
            button.setText("OFF");
            button.setActionCommand("off");
        }
        else{
            button.setActionCommand("on");
            button.setText("ON");
        }
    }

    public static void main(String[] args) {
        MT3aTask2 app = new MT3aTask2();
        app.setVisible(true);
    }
}
