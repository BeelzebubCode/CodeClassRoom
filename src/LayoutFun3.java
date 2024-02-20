import javax.swing.*;
import java.awt.GridLayout;

class LayoutFun3 extends JFrame {

	public LayoutFun3() {

		setTitle("Layout Fun");
		setSize(400, 340);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new GridLayout(2, 3));

		final JButton button1 = new JButton("1");
        getContentPane().add(button1);

        final JButton button2 = new JButton("2");
        getContentPane().add(button2);

        final JButton button3 = new JButton("3");
        getContentPane().add(button3);

        final JButton button4 = new JButton("4");
        getContentPane().add(button4);

        final JButton button5 = new JButton("5");
        getContentPane().add(button5);
	}
	
	public static void main(String[] args) {
		LayoutFun3 app = new LayoutFun3();
		app.setVisible(true);
	}
}

