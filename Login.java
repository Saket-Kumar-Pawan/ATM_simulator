package bankmanagementsystem;


import java.awt.*;

import javax.swing.*;

import java.awt.event.*;


@SuppressWarnings("serial")
public class Login extends JFrame implements ActionListener {
	
	JButton login, signup, clear;
	JTextField cardTextField, pinTextField;
	
	Login() {
		
		setLayout(null);
		
		String imagePath = "C:\\Users\\saket\\Desktop\\Recip\\icons\\logo.jpg";
        ImageIcon i1 = new ImageIcon(imagePath);
        Image i2 =i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label1 = new JLabel(i3);
		
		label1.setBounds(70, 10, 100, 100);
		add (label1);
		
		JLabel text = new JLabel("Welcome to Hector Bank");
		text.setFont(new Font("Osward", Font.BOLD, 24));
		text.setBounds(200, 40, 400, 40);
		add (text);
		
		
		
		label1.setBounds(70, 10, 100, 100);
		add (label1);
		
		JLabel cardno = new JLabel("Card No:");
		cardno.setFont(new Font("Osward", Font.BOLD, 24));
		cardno.setBounds(200, 100, 400, 40);
		add (cardno);
		
		cardTextField = new JTextField();
		cardTextField.setBounds(350, 110, 400, 20);
		cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
		add(cardTextField);
		
		label1.setBounds(70, 10, 100, 100);
		add (label1);
		
		JLabel pin = new JLabel("Pin");
		pin.setFont(new Font("Osward", Font.BOLD, 24));
		pin.setBounds(200, 150, 400, 40);
		add (pin);
		
		pinTextField = new JPasswordField();
		pinTextField.setBounds(350, 160, 400, 20);
		add(pinTextField);
		
		setSize(900,700);
		setVisible(true);
		setLocation(150,50);
		setTitle("Hector Bank");
		
		getContentPane().setBackground(Color.WHITE);
		
		
		
		
	    login = new JButton("Sign IN");
		login.setBounds(380, 200, 80, 20);
		login.setForeground(Color.BLACK);
		login.addActionListener(this);
		add(login);		
		

		clear = new JButton("Clear");
		clear.setBounds(480, 200, 80, 20);
		clear.setForeground(Color.BLACK);
		clear.addActionListener(this);
		add(clear);		
		

		signup = new JButton("Sign Up");
		signup.setBounds(580, 200, 80, 20);
		signup.setForeground(Color.BLACK);
		signup.addActionListener(this);
		add(signup);		
		
		
	
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == clear) {
			cardTextField.setText("");
			pinTextField.setText("");
		} else if (ae.getSource() == login) {
			cardTextField.setText("");
			pinTextField.setText("");
		} else if (ae.getSource() == signup) {
			setVisible(false);
			new SignupOne().setVisible(true);
		}
		
	}
	

	public static void main(String[] args) {
		new Login();
		

	}

}
