package basic_computation;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class BC_Frame extends JFrame{
	public BC_Frame() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		setLayout(null);
		
		JTextField jtf1 = new JTextField();
		jtf1.setBounds(0, 30, 300, 50);
		
		add(jtf1);
		setVisible(true);
	}
}
