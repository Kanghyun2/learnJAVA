import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.CardLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.SpringLayout;

public class MyFirstLayout extends JFrame {
	private final JButton btnNewButton_1 = new JButton("New button");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFirstLayout frame = new MyFirstLayout();
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
	public MyFirstLayout() {
		getContentPane().setBackground(Color.ORANGE);
		getContentPane().setForeground(Color.PINK);
		SpringLayout springLayout = new SpringLayout();
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1, 5, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1, 219, SpringLayout.WEST, getContentPane());
		getContentPane().setLayout(springLayout);
		
		JButton btnNewButton = new JButton("New button");
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 5, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 117, SpringLayout.WEST, getContentPane());
		getContentPane().add(btnNewButton);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ㅋㅋㅋ");
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_2, 79, SpringLayout.SOUTH, btnNewButton);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_2, -174, SpringLayout.EAST, getContentPane());
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		getContentPane().add(btnNewButton_2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
	}
}
