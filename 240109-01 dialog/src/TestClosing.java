import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

class CloseFrame extends JFrame {
	public CloseFrame() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int select = JOptionPane.showConfirmDialog(CloseFrame.this, 
						"정말로 종료하실 건가요?", 
						"종료", 
						JOptionPane.YES_NO_CANCEL_OPTION);
				if (select == JOptionPane.YES_NO_OPTION) {
//					dispose();
					System.exit(0);
				}
			}
		});
		
		showGUI();
	}

	private void showGUI() {
		setSize(500, 500);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setVisible(true);
	}
}

public class TestClosing {
	public static void main(String[] args) {
		new CloseFrame();
	}
}
