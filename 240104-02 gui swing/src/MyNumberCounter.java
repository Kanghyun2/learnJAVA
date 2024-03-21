import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyNumberCounter extends JFrame implements ActionListener {
	protected JLabel lblNumber;
	protected int number;
	
	
	public MyNumberCounter() {
		JPanel pnl = new JPanel();
		lblNumber = new JLabel(String.valueOf(number));
		JButton btnincrease = new JButton("증가");
		JButton btndecrease = new JButton("감소");
		JButton btnReset = new JButton("초기화");
		btnincrease.addActionListener(this);
		btndecrease.addActionListener(this);
		
		pnl.add(lblNumber);
		pnl.add(btnincrease);
		pnl.add(btndecrease);
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	String command = e.getActionCommand();
	if(command.equals("증가")) {
		number++;
	} else if (command.equals("감소")) {
		number--;
	} else if (command.equals("초기화")) {	
		number = 0;
	} else {
		lblNumber.setText(String.valueOf(number));
	}
		
	}
	public static void main(String[] args) {
		new MyNumberCounter();
	}
}
