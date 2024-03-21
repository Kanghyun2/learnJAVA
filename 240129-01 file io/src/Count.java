import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Count extends JFrame {
	private int count = 0;
	private JLabel countLabel;
	private JButton toggleButton;
	private Timer timer;
	private boolean counting = false;

	public Count() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		countLabel = new JLabel(readLastNumber());
		add(countLabel);

		toggleButton = new JButton("해줘");
		toggleButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (counting) {
					stopCounting();
				} else {
					startCounting();
				}
			}
		});
		add(toggleButton, BorderLayout.SOUTH);

		timer = new Timer(50, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				countLabel.setText("해줘 " + count);
			}
		});
	}

	private void startCounting() {
		counting = true;
		timer.start();
	}

	private void stopCounting() {
		counting = false;
		timer.stop();
		countFile();
		saveLastNumber(countLabel.getText());
		
	}

	private void countFile() {

		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileWriter(new File("d:\\mydata\\count.txt")));
			pw.println(count);
			pw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
	}
	
	private String readLastNumber() {
		File file = new File("d:\\mydata\\lastnumber.txt");
		String defaultValue = "1";
		if (!file.exists()) {
			return defaultValue;
		}
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			String numberValue = br.readLine();
			
//			Integer.valueOf(numberValue);
			
			return numberValue;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return defaultValue;
	}

	private void saveLastNumber(String numberText) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter("d:\\mydata\\lastnumber.txt");
			pw.println(numberText);
			pw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
	}

	public static void main(String[] args) {
		new Count();
	}
}
