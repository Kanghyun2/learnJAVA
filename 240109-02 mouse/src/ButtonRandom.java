import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonRandom extends JFrame {
	Random random = new Random();
	private JButton rbtn;

	public ButtonRandom() {
		JPanel pnl = new JPanel();
		rbtn = new JButton("눌러봐");
		rbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				int randomXY = random.nextInt(400);
				rbtn.setLocation(randomXY, randomXY);
			
			}

		});
		add(pnl);
		pnl.add(rbtn);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		new ButtonRandom();
	}
}
