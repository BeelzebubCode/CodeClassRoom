import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FracSimple6 extends JFrame implements ActionListener{
    final JTextField topField1, topField2; // เก็บเศษตัวที่1, 2
    final JTextField bottomField1, bottomField2; //เก็บส่วนตัวที่ 1, 2
    final JLabel equalsLabel, resultTop, resultBottom; // เก็บเครื่องหมาย = และ resultTop, resultBottom เก็บคำตอบ
    final JButton calcButton; // ปุ่มคำนวณ

    public FracSimple6(){
        setTitle("Fraction Calculator");
        setSize(280, 130);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout()); // ให้ JFrame เป็น Layout แบบ BorderLayout

        // สร้าง panel หลัก ให้ layout is FlowLayout
        final JPanel calcPanel = new JPanel(new FlowLayout());
        getContentPane().add(calcPanel, BorderLayout.CENTER);

        // ทำ panel รองเป็น GridLayout 2 rows 1 column มาเก็บเลขเศษส่วนตัวแรก
        final JPanel panel1 = new JPanel(new GridLayout(2, 1));
        calcPanel.add(panel1); // เพิ่ม panel1 ไปใน panel หลัก

        // สร้างปุ่มคำนวณ 
        calcButton = new JButton("Calculator");
        calcButton.addActionListener(this); // เพิ่ม Action ให้ปุ่ม
        getContentPane().add(calcButton, BorderLayout.PAGE_END); // เพิ่มปุ่มไปใน panel หลักและจัดตำแหน่งไว้ที่ ล่างสุดด้วย PAGE_END

        //  สร้างช่องข้อความที่มาเก็บ top1 โดยมีขนาด 2
        topField1 = new JTextField("1", 2);
        panel1.add(topField1, BorderLayout.LINE_START); // เพิ่มช่องข้อความไปใน panel1 ที่เป็น layout grid

         //  สร้างช่องข้อความที่มาเก็บ bottom1 โดยมีขนาด 2
        bottomField1 = new JTextField("1", 2);
        panel1.add(bottomField1, BorderLayout.LINE_START); // เพิ่มช่องข้อความไปใน panel1 ที่เป็น layout grid

        // สร้างป้ายข้อความ +
        final JLabel plusLabel = new JLabel("+");
        plusLabel.setFont(plusLabel.getFont().deriveFont(20.0f)); // ปรับขนาด font
        calcPanel.add(plusLabel, BorderLayout.CENTER); // เพิ่มข้อความ + ไปที่ panel หลัก

        // สร้าง panel2 มาเพื่อเก็บ top2 and bottom2 โดยให้  layout is Grid 2rows 1column
        final JPanel panel2 = new JPanel(new GridLayout(2, 1));
        calcPanel.add(panel2); // เพิ่ม panel2 ไปที่ Panel หลัก

        // สร้างช่องข้อความมาเก็บ top2
        topField2 = new JTextField("1", 2);
        panel2.add(topField2, BorderLayout.LINE_END); // add go to panel2

        // สร้างช่องข้อความมาเก็ย bottom2
        bottomField2 = new JTextField("1", 2);
        panel2.add(bottomField2, BorderLayout.LINE_END); // add go to panel2

        // สร้างป้ายข้อความ = 
        equalsLabel = new JLabel("= ");
        equalsLabel.setFont(equalsLabel.getFont().deriveFont(20.0f));
        calcPanel.add(equalsLabel); // add go to panel main

        // สร้าง panel3 มาเก็บคำตอบ top3 bottom3 โดย Layout Grid 2rows 1column
        final JPanel panel3 = new JPanel(new GridLayout(2, 1));
        calcPanel.add(panel3); // เพิ่มไปที่ panel main

        resultTop = new JLabel(""); // ให้คำตอบเป็นค่าว่าง
        // ขีดเส้นแค่จุด Bottom และตั้งเป็นเส้น สีดำ => Color.BLACK
        resultTop.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, Color.BLACK));
        resultTop.setFont(resultTop.getFont().deriveFont(20.0f));
        panel3.add(resultTop); // เพิ่ม resultTop ไปที่ panel3

        resultBottom = new JLabel(""); // ให้คำตอบเป็นค่าว่าง
        resultBottom.setFont(resultBottom.getFont().deriveFont(20.0f));
        panel3.add(resultBottom); // เพิ่ม resultBottom ไปที่ panel3
        // calcPanel.setBackground(Color.red);
    }

    @Override
    public void actionPerformed(ActionEvent e){

        // เมื่ออีเว้นที่เข้ามาเป็น button
        if(e.getSource() == calcButton){
            // int top1 = Integer.parseInt(topField1.getText()) * Integer.parseInt(bottomField2.getText());
            // int top2 = Integer.parseInt(topField2.getText()) * Integer.parseInt(bottomField1.getText());

            // เช็คว่าส่วนเท่ากันหรือไม่
            if(bottomField1.getText().equals(bottomField2.getText())){
                resultTop.setText(String.valueOf(Integer.parseInt(topField1.getText())+(Integer.parseInt(topField2.getText()))));
                resultBottom.setText(String.valueOf(bottomField1.getText()));
            }
            // เมื่อส่วนไม่เท่ากัน
            else{
                // top ได้จากการนำ (top1*bottom2)+(top2*bottom1)
                int top = (Integer.parseInt(topField1.getText()) * Integer.parseInt(bottomField2.getText())) + (Integer.parseInt(topField2.getText()) * Integer.parseInt(bottomField1.getText()));
                // bottom ได้จาก (bottom1*bottom2)
                int bottom = (Integer.parseInt(bottomField1.getText()))*(Integer.parseInt(bottomField2.getText()));
                resultTop.setText(String.valueOf(top)); 
                resultBottom.setText(String.valueOf(bottom));
            }
            
        }
    }

    public static void main(String[] args) {
        FracSimple6 app = new FracSimple6();
        app.setVisible(true); // ทำให้มองเห็ย frame

    }
}
