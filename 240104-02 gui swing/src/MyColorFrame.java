import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// 색 변경 버튼 (임의의 색으로 변경된다)
public class MyColorFrame extends JFrame implements ActionListener{
	private JPanel pnl;
	private Random random;

	public MyColorFrame() {
		random = new Random();
		
		pnl = new JPanel();
		pnl.setBackground(new Color(0, 0, 0));
		
		JButton button = new JButton("색 변경");
		button.addActionListener(this);
		pnl.add(button);

		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int red = random.nextInt(256);
		int green = random.nextInt(256);
		int blue = random.nextInt(256);
		pnl.setBackground(new Color(red, green, blue));
		
	}
	
	public static void main(String[] args) {
		new MyColorFrame();
	}

}
