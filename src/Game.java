import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

class Game extends JFrame implements ActionListener{

	final JLabel questionLabel, resultLabel;
	final JButton button1, button2;
	private int score = 0; // เก็บคะแนนเมื่อ User ตอบถูก
	private boolean pressrd; // เก็บสถานะสลับปุ่ม 

	public Game() {
		//Game extends JFrame จึงสามรถเรียกใช้ Method ของ JFrame ได้เลย 
		setTitle("Countries and Cities Game"); 
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // เมื่อกดออกโปรแกรมจะจบการทำงาน

		// เซ็ตเป็น FlowLayout ตัวที่เพิ่มเข้ามาจะต่อท้าย
		setLayout(new FlowLayout());

		questionLabel = new JLabel();
        getContentPane().add(questionLabel);

		button1 = new JButton();
		button2 = new JButton();
		getContentPane().add(button2);
		getContentPane().add(button1);
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		// ยังไม่มีการสลับปุ่ม
		pressrd = false;
		nextQuestion(); // สุ่มคำถาม
		resultLabel = new JLabel(""); //เอาไว้เก็บข้อความเมื่อตอบผิดหรือถูก
		getContentPane().add(resultLabel);
	}

	// Method สุ่มคำถาม และสลับปุ่มคำตอบ
    private void nextQuestion() {
		Question question = Question.randomQuestion();
    	questionLabel.setText(question.getText());

		// ถ้าเป็นจริง ให้สลับปุ่ม
		if(pressrd){
			button1.setText(question.getOtherAnswer()); 
			button2.setText(question.getCorrectAnswer());

			button1.setActionCommand(question.getOtherAnswer()); // button 1 เก็บคำตอบที่ผิด
			button2.setActionCommand(question.getCorrectAnswer());  //button 2 เก็บคำตอบที่ถูก
		}
		else{ // ปุ่มเริ่มต้น
			button1.setText(question.getCorrectAnswer()); 
			button2.setText(question.getOtherAnswer());

			button1.setActionCommand(question.getCorrectAnswer()); //button 1 เก็บคำตอบที่ถูก
			button2.setActionCommand(question.getOtherAnswer()); // button 2 เก็บคำตอบที่ผิด
		}
    }

	@Override
	public void actionPerformed(ActionEvent e){
		JButton button = (JButton) e.getSource();
		// answer เก็บคำตอบที่ถูก
		String answer = ((pressrd)? button2.getActionCommand() : button1.getActionCommand());
		
		// เช็คว่าปุ่มที่กดมาใช่คำตอบที่ถูกไหม
		if(button.getActionCommand().equals(answer)){
			//เมื่อถูกให้คะแนน++ และแสดงข้อความว่าถูกกับ คะแนนรวม
			score++;
			resultLabel.setText("Correct! Score: "+score);
		}
		else{
			//เมื่อผิดให้รีเซ็ตคะแนนเป็น 0
			resultLabel.setText("Sorry, you are wrong");
			score = 0;
		}
		pressrd = !pressrd; // ให้สลับปุ่ม
		nextQuestion(); // สุ่มคำถามใหม่ 
		
	}

    public static void main(String[] args) {
		Game app = new Game();
		app.setVisible(true); // ตั้งให้มองเห็นกราฟฟิก GUI ของ JFrame
	}
}
