package dd;
// 설문조사 집계 프로그램

// 인적사항 (이름, 전화번호)와
// 응답(찬성, 반대)
// 정보를 기록하는 프로그램
// 정보 기록, 응답 집계 (총 찬성, 반대 수 출력)
// 단, 동일 인물의 기록한 하나만 존재해야한다.

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;

class Person {
	private String name;
	private String number;

	public Person(String name, String number) {
		super();
		this.name = name;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", number=" + number + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (number == null) {
			if (other.number != null) {
				return false;
			}
		} else if (!number.equals(other.number)) {
			return false;
		}
		return true;
	}
}

public class Poll extends JFrame {
	private JTextField tfName;
	private JTextField tfNumber;

	public Poll() {
		setForeground(Color.LIGHT_GRAY);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\GGG\\Desktop\\춘식17.png"));
		setTitle("설문 조사");
		SpringLayout springLayout = new SpringLayout();

		JPanel pnl = new JPanel();
		
		JPanel pnlTitle = new JPanel();
		pnlTitle.setBackground(Color.LIGHT_GRAY);
		JLabel lblNewLabel = new JLabel("                    설문 조사");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("궁서", Font.PLAIN, 20));
		JButton btnVote = new JButton("투표 시작");
		btnVote.setFont(new Font("휴먼편지체", Font.PLAIN, 14));
		btnVote.setForeground(Color.RED);
		btnVote.setBackground(Color.ORANGE);
		
		JPanel pnlVote = new JPanel();
		pnlVote.setBackground(Color.LIGHT_GRAY);
		JLabel lblName = new JLabel("이름");
		lblName.setFont(new Font("궁서", Font.PLAIN, 14));
		JLabel lblNumber = new JLabel("전화번호");
		lblNumber.setFont(new Font("궁서", Font.PLAIN, 14));
		JButton btnAgree = new JButton("찬성");
		btnAgree.setForeground(Color.BLUE);
		btnAgree.setFont(new Font("궁서", Font.PLAIN, 14));
		JButton btnOpposite = new JButton("반대");
		btnOpposite.setForeground(Color.RED);
		btnOpposite.setFont(new Font("궁서", Font.PLAIN, 14));
		tfName = new JTextField();
		tfNumber = new JTextField();
		
		CardLayout card = new CardLayout();
		SpringLayout sl_pnlTitle = new SpringLayout();
		sl_pnlTitle.putConstraint(SpringLayout.NORTH, btnVote, 44, SpringLayout.SOUTH, lblNewLabel);
		sl_pnlTitle.putConstraint(SpringLayout.WEST, btnVote, 192, SpringLayout.WEST, pnlTitle);
		
		pnlVote.setLayout(springLayout);
		
		pnl.setLayout(card);
		
		pnlTitle.add(btnVote);
		pnlTitle.add(lblNewLabel);
		
		pnl.add(pnlTitle, "title");
		pnl.add(pnlVote, "vote");
		
		getContentPane().add(pnl);
		
		sl_pnlTitle.putConstraint(SpringLayout.NORTH, lblNewLabel, 33, SpringLayout.NORTH, pnlTitle);
		sl_pnlTitle.putConstraint(SpringLayout.WEST, lblNewLabel, 47, SpringLayout.WEST, pnlTitle);
		sl_pnlTitle.putConstraint(SpringLayout.SOUTH, lblNewLabel, 113, SpringLayout.NORTH, pnlTitle);
		sl_pnlTitle.putConstraint(SpringLayout.EAST, lblNewLabel, 408, SpringLayout.WEST, pnlTitle);
		pnlTitle.setLayout(sl_pnlTitle);

		springLayout.putConstraint(SpringLayout.NORTH, btnAgree, 7, SpringLayout.NORTH, lblName);
		springLayout.putConstraint(SpringLayout.NORTH, btnOpposite, -4, SpringLayout.NORTH, lblNumber);
		springLayout.putConstraint(SpringLayout.WEST, btnOpposite, 0, SpringLayout.WEST, btnAgree);
		springLayout.putConstraint(SpringLayout.WEST, btnAgree, 77, SpringLayout.EAST, tfName);
		
		btnVote.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(pnl, "vote");
				
			}
		});
		
		ArrayList<Person> personList = new ArrayList<>();
		ArrayList<Person> OppositeList = new ArrayList<>();
		btnAgree.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = tfName.getText();
				String number = tfName.getText();
				Person person = new Person(name, number);
				if (!personList.contains(person) && !OppositeList.contains(person)) {
					personList.add(person);
				} else if (personList.contains(person) && OppositeList.contains(person)) {
					System.out.println("이미 투표하셨습니다.");
				}
				System.out.println("찬성 목록" + personList + "찬성 인원 : " + personList.size());
			}
		});
		btnOpposite.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = tfName.getText();
				String number = tfName.getText();
				Person person = new Person(name, number);
				if (!OppositeList.contains(person) && !personList.contains(person)) {
					OppositeList.add(person);
				} else if (personList.contains(person) && OppositeList.contains(person)) {
					System.out.println("이미 투표 하셨습니다.");
				}
				System.out.println("반대 목록" + OppositeList + "반대 인원: " + OppositeList.size());
			}
		});
		JButton btnNewButton = new JButton("찬/반 총집계");
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.setFont(new Font("궁서", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("총 찬성 인원 : "+ personList.size() + "  총 반대 인원 : " + OppositeList.size());
			}
		});

		springLayout.putConstraint(SpringLayout.NORTH, lblName, 55, SpringLayout.NORTH, pnlVote);
		springLayout.putConstraint(SpringLayout.WEST, lblName, 55, SpringLayout.WEST, pnlVote);
		springLayout.putConstraint(SpringLayout.SOUTH, lblName, 91, SpringLayout.NORTH, pnlVote);
		pnlVote.add(lblName);

		springLayout.putConstraint(SpringLayout.NORTH, tfName, 8, SpringLayout.NORTH, lblName);
		springLayout.putConstraint(SpringLayout.WEST, tfName, 28, SpringLayout.EAST, lblName);
		pnlVote.add(tfName);
		tfName.setColumns(10);

		springLayout.putConstraint(SpringLayout.NORTH, lblNumber, 64, SpringLayout.SOUTH, lblName);
		springLayout.putConstraint(SpringLayout.WEST, lblNumber, 38, SpringLayout.WEST, pnlVote);
		pnlVote.add(lblNumber);

		springLayout.putConstraint(SpringLayout.NORTH, tfNumber, -3, SpringLayout.NORTH, lblNumber);
		springLayout.putConstraint(SpringLayout.EAST, tfNumber, 0, SpringLayout.EAST, tfName);
		pnlVote.add(tfNumber);
		tfNumber.setColumns(10);
		pnlVote.add(btnAgree);
		pnlVote.add(btnOpposite);

		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, -25, SpringLayout.SOUTH, pnlVote);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, -31, SpringLayout.EAST, pnlVote);
		pnlVote.add(btnNewButton);
		
		showGUI();
		
	}

	private void showGUI() {
		setSize(500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Poll();
	}

}
