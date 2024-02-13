import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

class Game extends JFrame implements ActionListener{

	final JLabel questionLabel, resultLabel;
	final JButton button1, button2;
	private int score = 0;
	private boolean pressrd;

	public Game() {

		setTitle("Countries and Cities Game");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		questionLabel = new JLabel();
        getContentPane().add(questionLabel);

		button1 = new JButton();
		button2 = new JButton();
		getContentPane().add(button2);
		getContentPane().add(button1);
		button1.addActionListener(this);
		button2.addActionListener(this);
	
		pressrd = false;
		nextQuestion();
		resultLabel = new JLabel("");
		getContentPane().add(resultLabel);
	}

    private void nextQuestion() {
		Question question = Question.randomQuestion();
    	questionLabel.setText(question.getText());

		if(pressrd){
			button1.setText(question.getOtherAnswer());
			button2.setText(question.getCorrectAnswer());

			button1.setActionCommand(question.getOtherAnswer());
			button2.setActionCommand(question.getCorrectAnswer());
		}
		else{
			button1.setText(question.getCorrectAnswer());
			button2.setText(question.getOtherAnswer());

			button1.setActionCommand(question.getCorrectAnswer());
			button2.setActionCommand(question.getOtherAnswer());
		}
    }

	@Override
	public void actionPerformed(ActionEvent e){
		JButton button = (JButton) e.getSource();
		String answer = ((pressrd)? button2.getActionCommand() : button1.getActionCommand());

		if(button.getActionCommand().equals(answer)){
			score++;
			resultLabel.setText("Correct! Score: "+score);
		}
		else{
			resultLabel.setText("Sorry, you are wrong");
			score = 0;
		}
		pressrd = !pressrd;
		nextQuestion();
		
	}

    public static void main(String[] args) {
		Game app = new Game();
		app.setVisible(true);
	}
}
