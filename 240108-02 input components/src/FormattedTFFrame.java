import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.MaskFormatter;

public class FormattedTFFrame extends JFrame {
	public FormattedTFFrame() {
		JPanel pnl = new JPanel();
		MaskFormatter mask = null;
		try {
			mask = new MaskFormatter("010-####-####");
			mask.setPlaceholderCharacter('ㅇ');
			mask.setAllowsInvalid(false);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		JFormattedTextField ftf = new JFormattedTextField(mask);
		ftf.setColumns(20);
		
		pnl.add(ftf);
		add(pnl);
		
		showGUI();
	}
	private void showGUI() {
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new FormattedTFFrame();
	}
}
