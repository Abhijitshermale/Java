import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(0, 0, 0));
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 353, 528);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setForeground(new Color(253, 82, 0));
		textField.setBackground(new Color(0, 0, 0));
		textField.setBounds(10, 10, 318, 89);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				if(textField.getText().length()>0)
				{
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backspace = str.toString();
					textField.setText(backspace);
				}
			}
		});
		btnBackspace.setForeground(new Color(255, 0, 0));
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 30));
		btnBackspace.setBackground(new Color(0, 0, 0));
		btnBackspace.setBounds(10, 109, 72, 67);
		frame.getContentPane().add(btnBackspace);
		
		final JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number  = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setForeground(new Color(255, 255, 255));
		btn7.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn7.setBackground(new Color(0, 0, 0));
		btn7.setBounds(10, 186, 72, 67);
		frame.getContentPane().add(btn7);
		
		final JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number  = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setForeground(new Color(255, 255, 255));
		btn4.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn4.setBackground(new Color(0, 0, 0));
		btn4.setBounds(10, 263, 72, 67);
		frame.getContentPane().add(btn4);
		
		final JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number  = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setForeground(new Color(255, 255, 255));
		btn1.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn1.setBackground(new Color(0, 0, 0));
		btn1.setBounds(10, 340, 72, 67);
		frame.getContentPane().add(btn1);
		
		JButton btnZero = new JButton("0");
		btnZero.setForeground(new Color(255, 255, 255));
		btnZero.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnZero.setBackground(new Color(0, 0, 0));
		btnZero.setBounds(10, 417, 72, 67);
		frame.getContentPane().add(btnZero);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setForeground(new Color(255, 0, 0));
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnClear.setBackground(new Color(0, 0, 0));
		btnClear.setBounds(92, 109, 72, 67);
		frame.getContentPane().add(btnClear);
		
		final JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number  = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setForeground(new Color(255, 255, 255));
		btn8.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn8.setBackground(new Color(0, 0, 0));
		btn8.setBounds(92, 186, 72, 67);
		frame.getContentPane().add(btn8);
		
		final JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number  = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setForeground(new Color(255, 255, 255));
		btn5.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn5.setBackground(new Color(0, 0, 0));
		btn5.setBounds(92, 263, 72, 67);
		frame.getContentPane().add(btn5);
		
		final JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number  = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setForeground(new Color(255, 255, 255));
		btn2.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn2.setBackground(new Color(0, 0, 0));
		btn2.setBounds(92, 340, 72, 67);
		frame.getContentPane().add(btn2);
		
		final JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number  = textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setForeground(new Color(255, 255, 255));
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnDot.setBackground(new Color(0, 0, 0));
		btnDot.setBounds(92, 417, 72, 67);
		frame.getContentPane().add(btnDot);
		
		final JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number  = textField.getText()+btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setForeground(new Color(255, 0, 0));
		btn00.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn00.setBackground(new Color(0, 0, 0));
		btn00.setBounds(174, 109, 72, 67);
		frame.getContentPane().add(btn00);
		
		final JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number  = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setForeground(new Color(255, 255, 255));
		btn9.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn9.setBackground(new Color(0, 0, 0));
		btn9.setBounds(174, 186, 72, 67);
		frame.getContentPane().add(btn9);
		
		final JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number  = textField.getText()+btn6.getText();
				textField.setText(number);
			}
			
		});
		btn6.setForeground(new Color(255, 255, 255));
		btn6.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn6.setBackground(new Color(0, 0, 0));
		btn6.setBounds(174, 263, 72, 67);
		frame.getContentPane().add(btn6);
		
		final JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number  = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setForeground(new Color(255, 255, 255));
		btn3.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn3.setBackground(new Color(0, 0, 0));
		btn3.setBounds(174, 340, 72, 67);
		frame.getContentPane().add(btn3);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnPercent.setForeground(new Color(255, 255, 255));
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnPercent.setBackground(new Color(0, 0, 0));
		btnPercent.setBounds(174, 417, 72, 67);
		frame.getContentPane().add(btnPercent);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnAdd.setForeground(new Color(255, 0, 0));
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnAdd.setBackground(new Color(0, 0, 0));
		btnAdd.setBounds(256, 109, 72, 67);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnSub.setForeground(new Color(255, 0, 0));
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnSub.setBackground(new Color(0, 0, 0));
		btnSub.setBounds(256, 186, 72, 67);
		frame.getContentPane().add(btnSub);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMul.setForeground(new Color(255, 0, 0));
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnMul.setBackground(new Color(0, 0, 0));
		btnMul.setBounds(256, 263, 72, 67);
		frame.getContentPane().add(btnMul);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDiv.setForeground(new Color(255, 0, 0));
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnDiv.setBackground(new Color(0, 0, 0));
		btnDiv.setBounds(256, 340, 72, 67);
		frame.getContentPane().add(btnDiv);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second = Double.parseDouble(textField.getText());
				if(operation == "+")
				{
					result = first + second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "-")
				{
					result = first - second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "*")
				{
					result = first * second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "/")
				{
					result = first / second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "%")
				{
					result = first % second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
			}
		});
		btnEqual.setForeground(new Color(255, 0, 0));
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnEqual.setBackground(new Color(0, 0, 0));
		btnEqual.setBounds(256, 417, 72, 67);
		frame.getContentPane().add(btnEqual);
	}
}
