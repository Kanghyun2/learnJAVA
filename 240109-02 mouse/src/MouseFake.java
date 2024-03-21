import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class MouseFake extends JFrame {
	private JButton btnLogin;
	private CardLayout card;
	private JPanel pnlCenter;
	private JLabel lblID;
	private JTextField tfID;
	private JLabel lblPW;
	private JPasswordField passwordField;

	public MouseFake() {
		initComponents();

		btnLogin.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				card.show(pnlCenter, "Fake");
				setVisible(true);
			}
		});

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	private void initComponents() {
		pnlCenter = new JPanel();
		card = new CardLayout();
		pnlCenter.setLayout(card);

		JPanel panel = new JPanel();

		JPanel fake = new JPanel();
		JLabel lblfake = new JLabel("페이크다");

		pnlCenter.add(panel);
		pnlCenter.add(fake, "Fake");
		add(pnlCenter);
		fake.add(lblfake, "Center");

		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);

		lblID = new JLabel("아이디");
		sl_panel.putConstraint(SpringLayout.NORTH, lblID, 65, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblID, 63, SpringLayout.WEST, panel);
		panel.add(lblID);

		tfID = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, tfID, -3, SpringLayout.NORTH, lblID);
		sl_panel.putConstraint(SpringLayout.WEST, tfID, 30, SpringLayout.EAST, lblID);
		panel.add(tfID);
		tfID.setColumns(10);

		lblPW = new JLabel("패스워드");
		sl_panel.putConstraint(SpringLayout.NORTH, lblPW, 67, SpringLayout.SOUTH, lblID);
		sl_panel.putConstraint(SpringLayout.WEST, lblPW, 0, SpringLayout.WEST, lblID);
		panel.add(lblPW);

		btnLogin = new JButton("로그인");
		sl_panel.putConstraint(SpringLayout.NORTH, btnLogin, 0, SpringLayout.NORTH, lblID);
		sl_panel.putConstraint(SpringLayout.WEST, btnLogin, 22, SpringLayout.EAST, tfID);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnLogin, 106, SpringLayout.NORTH, lblID);
		sl_panel.putConstraint(SpringLayout.EAST, btnLogin, -70, SpringLayout.EAST, panel);
		panel.add(btnLogin);

		passwordField = new JPasswordField();
		passwordField.setColumns(10);
		sl_panel.putConstraint(SpringLayout.WEST, passwordField, 0, SpringLayout.WEST, tfID);
		sl_panel.putConstraint(SpringLayout.SOUTH, passwordField, 0, SpringLayout.SOUTH, lblPW);
		panel.add(passwordField);
	}

	public static void main(String[] args) {
		new MouseFake();
	}
}