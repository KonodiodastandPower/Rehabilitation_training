package basic_computation;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BC_Frame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int correct_num = 0;
	int wrong_num = 0;
	JLabel label;//题目
	JTextField textfield;//输入框
	JLabel data = new JLabel("数据:");
	JLabel correct = new JLabel("正确数:" + correct_num);//正确的
	JLabel wrong = new JLabel("错误数:" + wrong_num);//错误的
	int times = 0;
	Questions q = new Questions(1);
	public BC_Frame() {
		setTitle("Baisc Computation");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(200, 200, 300, 150);
		setLayout(null);
		
		label = new JLabel(q.name);
		label.setBounds(30, 0, 100, 40);
		
		textfield = new JTextField();
		textfield.setBounds(0, 40, 150, 40);
		textfield.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				char CODE = e.getKeyChar();
				if(CODE == KeyEvent.VK_ENTER) {
					String str = textfield.getText();
					textfield.setText("");
					if(times != 0 && q.answer != Integer.valueOf(str)) {
						wrong_num++;
						wrong.setText("错误数:"+wrong_num);
					}else if(times != 0 && q.answer == Integer.valueOf(str)) {
						correct_num++;
						correct.setText("正确数:" + correct_num);
					}
					q = null;
					q= new Questions();
					label.setText(q.name);
					times++;
				}
			}
			public void keyReleased(KeyEvent e) {}//木大
			public void keyPressed(KeyEvent e) {}//木大
		});
		
		data.setBounds(155, 0, 40, 20);
		
		correct.setBounds(155, 20, 100, 20);
		
		wrong.setBounds(155, 40, 100, 20);
		
		add(label);
		add(textfield);
		add(data);
		add(correct);
		add(wrong);
		
		setVisible(true);
		validate();
	}
}
