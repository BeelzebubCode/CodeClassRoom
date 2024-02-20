package MiniTest;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.BorderLayout;
// import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MT3aTask3 extends JFrame implements ActionListener{
    private JLabel label;
    private JButton btnLower, btnUpper;
    private JTextField textField;

    public MT3aTask3(){
        setTitle("Case");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(260, 50));
        getContentPane().add(textField);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(260, 50));
        panel.setLayout(new BorderLayout());
        getContentPane().add(panel);

        label = new JLabel("");
        label.setVerticalAlignment(JLabel.CENTER);
        panel.add(label);

        btnLower = new JButton("Lowercase");
        btnLower.setFocusable(false);
        btnLower.setActionCommand("lower");
        btnLower.addActionListener(this);

        btnUpper = new JButton("Uppercase");
        btnUpper.setFocusable(false);
        btnUpper.setActionCommand("upper");
        btnUpper.addActionListener(this);

        getContentPane().add(btnUpper);
        getContentPane().add(btnLower);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        JButton btn = (JButton) e.getSource();
        if(btn.getActionCommand().equals("upper")){
            label.setText(textField.getText().toUpperCase());
        }
        else{
            label.setText(textField.getText().toLowerCase());
        }
    }

    public static void main(String[] args) {
        MT3aTask3 app = new MT3aTask3();
        app.setVisible(true);
    }
}
