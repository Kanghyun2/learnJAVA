import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ComboBoxFrame extends JFrame {
	public ComboBoxFrame() {
		JPanel pnl = new JPanel();
		String[] menus = new String[] { "", "다음 중 하나를 선택하세요", "---------", "허성재", "이강현", "정일웅" };
		JComboBox<String> combo = new JComboBox<>(menus);

		combo.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					int index = combo.getSelectedIndex();
					if (index >= 0 && index <= 2) {
						combo.setSelectedIndex(0);
//					System.out.println(combo.getSelectedIndex());
//					System.out.println(combo.getSelectedItem());
					}
				}
			}
		});

		pnl.add(combo);
		add(pnl);

		showGUI();
	}

	private void showGUI() {
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ComboBoxFrame();
	}
}
