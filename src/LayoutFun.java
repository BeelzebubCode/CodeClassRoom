import javax.swing.*;
import java.awt.BorderLayout;

class LayoutFun extends JFrame {

	public LayoutFun() {

		setTitle("Layout Fun");
		setSize(400, 340);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		final JButton button1 = new JButton("1");
        getContentPane().add(button1, BorderLayout.PAGE_START);

        final JButton button2 = new JButton("2");
        getContentPane().add(button2, BorderLayout.CENTER);

        final JButton button3 = new JButton("3");
        getContentPane().add(button3, BorderLayout.LINE_START);

        final JButton button4 = new JButton("4");
        getContentPane().add(button4, BorderLayout.LINE_END);

        final JButton button5 = new JButton("5");
        getContentPane().add(button5, BorderLayout.PAGE_END);
	}
	
	public static void main(String[] args) {
		LayoutFun1 app = new LayoutFun1();
		app.setVisible(true);
	}
}
