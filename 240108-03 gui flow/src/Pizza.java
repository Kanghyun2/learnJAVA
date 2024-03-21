import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Toolkit;

public class Pizza extends JFrame {

	private JPanel contentPane2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblPrice;
	private JRadioButton pizza5;
	private JCheckBox piccle;
	private JCheckBox chesse;
	private JCheckBox cola;
	private JCheckBox hotsauce;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pizza frame = new Pizza();
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
	public Pizza() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Pizza.class.getResource("/dd/kitchenware_equipment_decor_set_room_interior_kitchen_fork_spoon_icon_260151.png")));
		setTitle("피자 메뉴");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane2 = new JPanel();
		contentPane2.setBackground(Color.CYAN);
		contentPane2.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane2);
		
		JRadioButton pizza1 = new JRadioButton("크러스트피자(S)");
		buttonGroup.add(pizza1);
		pizza1.setBackground(Color.RED);
		
		JRadioButton pizza2 = new JRadioButton("크러스트피자(L)");
		buttonGroup.add(pizza2);
		pizza2.setBackground(Color.RED);
		
		JRadioButton pizza3 = new JRadioButton("불고기피자(S)\r\n");
		buttonGroup.add(pizza3);
		pizza3.setBackground(Color.RED);
		
		JRadioButton pizza4 = new JRadioButton("불고기피자(L)\r\n");
		buttonGroup.add(pizza4);
		pizza4.setBackground(Color.RED);
		
		JButton btnNewButton = new JButton("선택 취소");
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				piccle.setSelected(false);
				chesse.setSelected(false);
				cola.setSelected(false);
				hotsauce.setSelected(false);
			}
		});
		
		pizza5 = new JRadioButton("페퍼로니피자");
		buttonGroup.add(pizza5);
		pizza5.setBackground(Color.RED);
		
		piccle = new JCheckBox("피클 추가");
		piccle.setBackground(Color.RED);
		piccle.setForeground(Color.BLACK);
		
		chesse = new JCheckBox("치즈 추가");
		chesse.setBackground(Color.RED);
		
		cola = new JCheckBox("콜라 추가");
		cola.setBackground(Color.RED);
		SpringLayout sl_contentPane = new SpringLayout();
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton, 0, SpringLayout.WEST, piccle);
		sl_contentPane.putConstraint(SpringLayout.EAST, chesse, -37, SpringLayout.EAST, contentPane2);
		sl_contentPane.putConstraint(SpringLayout.EAST, piccle, -37, SpringLayout.EAST, contentPane2);
		sl_contentPane.putConstraint(SpringLayout.NORTH, cola, 0, SpringLayout.NORTH, pizza3);
		sl_contentPane.putConstraint(SpringLayout.EAST, cola, 0, SpringLayout.EAST, piccle);
		sl_contentPane.putConstraint(SpringLayout.NORTH, chesse, 6, SpringLayout.SOUTH, piccle);
		sl_contentPane.putConstraint(SpringLayout.NORTH, piccle, 0, SpringLayout.NORTH, pizza2);
		sl_contentPane.putConstraint(SpringLayout.NORTH, pizza3, 85, SpringLayout.NORTH, contentPane2);
		sl_contentPane.putConstraint(SpringLayout.WEST, pizza3, 13, SpringLayout.WEST, contentPane2);
		sl_contentPane.putConstraint(SpringLayout.NORTH, pizza1, 62, SpringLayout.NORTH, contentPane2);
		sl_contentPane.putConstraint(SpringLayout.WEST, pizza1, 10, SpringLayout.WEST, contentPane2);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, pizza1, 81, SpringLayout.NORTH, contentPane2);
		sl_contentPane.putConstraint(SpringLayout.NORTH, pizza5, 135, SpringLayout.NORTH, contentPane2);
		sl_contentPane.putConstraint(SpringLayout.WEST, pizza5, 13, SpringLayout.WEST, contentPane2);
		sl_contentPane.putConstraint(SpringLayout.NORTH, pizza4, 110, SpringLayout.NORTH, contentPane2);
		sl_contentPane.putConstraint(SpringLayout.WEST, pizza4, 13, SpringLayout.WEST, contentPane2);
		sl_contentPane.putConstraint(SpringLayout.NORTH, pizza2, 33, SpringLayout.NORTH, contentPane2);
		sl_contentPane.putConstraint(SpringLayout.WEST, pizza2, 10, SpringLayout.WEST, contentPane2);
		contentPane2.setLayout(sl_contentPane);
		contentPane2.add(pizza2);
		contentPane2.add(piccle);
		contentPane2.add(pizza4);
		contentPane2.add(pizza5);
		contentPane2.add(cola);
		contentPane2.add(btnNewButton);
		contentPane2.add(pizza1);
		contentPane2.add(pizza3);
		contentPane2.add(chesse);
		
		lblPrice = new JLabel("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblPrice, 128, SpringLayout.NORTH, contentPane2);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblPrice, 28, SpringLayout.EAST, pizza4);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblPrice, -253, SpringLayout.SOUTH, contentPane2);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblPrice, -152, SpringLayout.EAST, contentPane2);
		contentPane2.add(lblPrice);
		
		hotsauce = new JCheckBox("핫소스 추가");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton, 20, SpringLayout.SOUTH, hotsauce);
		hotsauce.setBackground(Color.RED);
		sl_contentPane.putConstraint(SpringLayout.NORTH, hotsauce, 0, SpringLayout.NORTH, pizza4);
		sl_contentPane.putConstraint(SpringLayout.WEST, hotsauce, 0, SpringLayout.WEST, piccle);
		contentPane2.add(hotsauce);
		
		pizza1.setSelected(true);
		
		
		ItemListener listener = new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				int price = 0;
				if (pizza1.isSelected()) {
					price = 25000;
				}
				if (pizza2.isSelected()) {
					price = 30000;
				}
				if (pizza3.isSelected()) {
					price = 22000;
				}
				if (pizza4.isSelected()) {
					price = 24000;
				}
				if (pizza5.isSelected()) {
					price = 33000;
				}
				if (piccle.isSelected()) {
					price += 1000;
				}
				if (chesse.isSelected()) {
					price += 3000;
				}
				if (cola.isSelected()) {
					price += 2000;
				}
				if (hotsauce.isSelected()) {
					price += 500;
				}
				lblPrice.setText("주메뉴 가격 : " + price);
			}
		};
		pizza1.addItemListener(listener);
		pizza2.addItemListener(listener);
		pizza3.addItemListener(listener);
		pizza4.addItemListener(listener);
		pizza5.addItemListener(listener);
		piccle.addItemListener(listener);
		chesse.addItemListener(listener);
		cola.addItemListener(listener);
		hotsauce.addItemListener(listener);
		setVisible(true);
	}
	
}
