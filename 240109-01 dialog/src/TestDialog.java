import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

class MainFrame extends JFrame {
	public MainFrame(String title) {
		super(title);
		
		JButton btnPopup = new JButton("모달 대화상자");
		add(btnPopup);
		
		btnPopup.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("대화 상자를 생성합니다.");
				JDialog dialog = new MyDialog(MainFrame.this);
				dialog.setVisible(true);
				
				System.out.println("출력 확인!!");
			}
		});
		
		showGUI();
	}
	private void showGUI() {
		setSize(500, 500);
//		setLocation(800, 400);
		setLocationRelativeTo(null); // 화면 중앙
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}

class MyDialog extends JDialog { // 대화상자
	public MyDialog(JFrame parent) {
		super(parent);
		setTitle("대화 상자");
		setModal(true);
		
		setSize(300, 300);
//		setLocation(parent.getX() + parent.getWidth(), parent.getY()); 창오른쪽 
		setLocationRelativeTo(parent);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}

public class TestDialog {
	public static void main(String[] args) {
		new MainFrame("메인 창");
	}
}
