import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;

public class Milekm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblResult;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Milekm frame = new Milekm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Milekm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);

		JRadioButton MiletoKm = new JRadioButton("Mile를 Km로");
		buttonGroup.add(MiletoKm);
		sl_contentPane.putConstraint(SpringLayout.NORTH, MiletoKm, 10, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, MiletoKm, 72, SpringLayout.WEST, contentPane);
		contentPane.add(MiletoKm);

		JRadioButton KmtoMile = new JRadioButton("Km를 Mile로");
		buttonGroup.add(KmtoMile);
		sl_contentPane.putConstraint(SpringLayout.NORTH, KmtoMile, 0, SpringLayout.NORTH,
				MiletoKm);
		sl_contentPane.putConstraint(SpringLayout.WEST, KmtoMile, 16, SpringLayout.EAST,
				MiletoKm);
		contentPane.add(KmtoMile);

		textField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField, 14, SpringLayout.SOUTH, MiletoKm);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField, 0, SpringLayout.WEST, MiletoKm);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		btnNewButton = new JButton("변환 하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double result;
				double input = Double.parseDouble(textField.getText());
				if (MiletoKm.isSelected()) {
					result = convertMiletoKm(input);
					lblResult.setText(String.format("%.2f Miles 은 %.2f KM", input, result));
				} else if (KmtoMile.isSelected()) {
					result = convertKmtoMile(input);
					lblResult.setText(String.format("%.2f KM 은 %.2f Miles", input, result));
					
				}
			}
		});
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton, 16, SpringLayout.EAST, textField);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton, 0, SpringLayout.SOUTH, textField);
		contentPane.add(btnNewButton);

		lblResult = new JLabel("");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblResult, 18, SpringLayout.EAST, btnNewButton);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblResult, 0, SpringLayout.SOUTH, textField);
		contentPane.add(lblResult);
	}

	private double convertMiletoKm(double mile) {
		return mile * 1.60934;
	}

	private double convertKmtoMile(double km) {
		return km / 1.60934;
	}

}
