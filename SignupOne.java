package bankmanagementsystem;
import java.awt.Color;
import java.awt.Font;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

@SuppressWarnings("serial")
public class SignupOne  extends JFrame implements ActionListener {

	long random;
	


	JTextField nameTextField, fnameTextField,  emailTextField, addressTextField, cityTextField, stateTextField, pinTextField;
	JButton next;
	JRadioButton male, female, other, married, unmarried;
	JDateChooser dateChooser;




	
	SignupOne() {
		
		setLayout(null);
		
		Random ran = new Random();
		 long random =Math.abs(ran.nextLong() % 9000L + 1000L);
		
		 JLabel formno = new JLabel("Application Form No. " + random);
		 formno.setFont(new Font("Railway", Font.BOLD, 38));
		 formno.setBounds(140,  20, 600, 40);
		 add(formno);
		
		 JLabel personalDetails = new JLabel(" Page 1: Personal Details  " );
		 personalDetails.setFont(new Font("Railway", Font.BOLD, 22));
		 personalDetails.setBounds(290,  80, 600, 40);
		 add(personalDetails);
		 
		 JLabel name = new JLabel(" Name : " );
		 name.setFont(new Font("Railway", Font.BOLD, 18));
		 name.setBounds(190,  110, 600, 40);
		 add(name);
		 
		 JLabel fname = new JLabel(" Father's Name : " );
		 fname.setFont(new Font("Railway", Font.BOLD, 18));
		 fname.setBounds(190,  130, 600, 40);
		 add(fname);
		 
		 JLabel dob = new JLabel(" Date Of Birth : " );
		 dob.setFont(new Font("Railway", Font.BOLD, 18));
		 dob.setBounds(190,  150, 600, 40);
		 add(dob);
		 
		 dateChooser = new JDateChooser();
		 dateChooser.setBounds(360, 160, 160, 20);
		 add(dateChooser);
		 
		 JLabel gender = new JLabel(" Gender : " );
		 gender.setFont(new Font("Railway", Font.BOLD, 18));
		 gender.setBounds(190,  170, 600, 40);
		 add(gender); 
		 
		 JLabel email = new JLabel(" email ID : " );
		 email.setFont(new Font("Railway", Font.BOLD, 18));
		 email.setBounds(190,  190, 600, 40);
		 add(email);
		 
		 JLabel marital = new JLabel(" Maritail Status: " );
		 marital.setFont(new Font("Railway", Font.BOLD, 18));
		 marital.setBounds(190,  210, 600, 40);
		 add(marital);

		 JLabel address = new JLabel(" Address : " );
		 address.setFont(new Font("Railway", Font.BOLD, 18));
		 address.setBounds(190,  230, 600, 40);
		 add(address);
		 
		 JLabel city = new JLabel(" City : " );
		 city.setFont(new Font("Railway", Font.BOLD, 18));
		 city.setBounds(190,  250, 600, 40);
		 add(city);
		 
		 JLabel state = new JLabel(" State : " );
		 state.setFont(new Font("Railway", Font.BOLD, 18));
		 state.setBounds(190,  270, 600, 40);
		 add(state);
		 
		 JLabel pin = new JLabel(" Pin Code : " );
		 pin.setFont(new Font("Railway", Font.BOLD, 18));
		 pin.setBounds(190,  290, 600, 40);
		 add(pin);
		 
		  nameTextField = new JTextField();
		 nameTextField.setFont(new Font("Railway", Font.BOLD, 14));
		 nameTextField.setBounds(360, 120, 300, 20 );
		 add(nameTextField);
		 
		  fnameTextField = new JTextField();
		 fnameTextField.setFont(new Font("Railway", Font.BOLD, 14));
		 fnameTextField.setBounds(360, 140, 300, 20 );
		 add(fnameTextField);
		 
		
		  male = new JRadioButton("Male");
		 male.setBounds(360, 180, 60, 20 );
		 male.setBackground(Color.gray);
		 add(male);
		 
		  female = new JRadioButton("Female");
		 female.setBounds(440, 180, 100, 20 );
		 female.setBackground(Color.gray);
		 add(female);
		 
		 ButtonGroup gendergroup = new ButtonGroup();
		 gendergroup.add(male);
		 gendergroup.add(female);

		 

		 
		  emailTextField = new JTextField();
		 emailTextField.setFont(new Font("Railway", Font.BOLD, 14));
		 emailTextField.setBounds(360, 200, 300, 20 );
		 add(emailTextField);
		 
		 
		 
		  married = new JRadioButton("Married");
		 married.setBounds(360, 220, 80, 20 );
		 married.setBackground(Color.gray);
		 add(married);
		 
		  unmarried = new JRadioButton("Unmarried");
		 unmarried.setBounds(440, 220, 100, 20 );
		 unmarried.setBackground(Color.gray);
		 add(unmarried);
		 
		  other = new JRadioButton("Other");
		 other.setBounds(560, 220, 100, 20 );
		 other.setBackground(Color.gray);
		 add(other);
		 
		
		 
		 ButtonGroup maritalgroup = new ButtonGroup();
		 maritalgroup.add(married);
		 maritalgroup.add(unmarried);
		 maritalgroup.add(other);

		  addressTextField = new JTextField();
		 addressTextField.setFont(new Font("Railway", Font.BOLD, 14));
		 addressTextField.setBounds(360, 240, 300, 20 );
		 add(addressTextField);
		 
		  cityTextField = new JTextField();
		 cityTextField.setFont(new Font("Railway", Font.BOLD, 14));
		 cityTextField.setBounds(360, 260, 300, 20 );
		 add(cityTextField);
		 
		  stateTextField = new JTextField();
		 stateTextField.setFont(new Font("Railway", Font.BOLD, 14));
		 stateTextField.setBounds(360, 280, 300, 20 );
		 add(stateTextField);
		 
		  pinTextField = new JTextField();
		 pinTextField.setFont(new Font("Railway", Font.BOLD, 14));
		 pinTextField.setBounds(360, 300, 300, 20 );
		 add(pinTextField);
		 
		  next = new JButton("Next");
		 next.setBackground(Color.BLACK);
		 next.setForeground(Color.white);
		 next .setBounds( 620, 380, 80, 30);
		 
		
		 next.addActionListener(this);
		 add(next);




		
		getContentPane().setBackground(Color.gray);
		
		setSize(900,700);
		setLocation(350,10);
		setVisible(true);
		 
	}
	
	public void actionPerformed(ActionEvent ae) {
		String formno = "" + random; //long
		String name = nameTextField.getText();
		String fname = nameTextField.getText();
		String dob =((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
		String gender = null;
		if (male.isSelected()) {
			gender = "Male";
		}else if (female.isSelected());
		gender = "Female";
		
		String email = emailTextField.getText();
		
		String marital = null;
		if(married.isSelected()) {
			marital = "Married";
		} else if(unmarried.isSelected()) {
			marital = "Unmarried";
		} else if (other.isSelected() ) {
			marital = "Other";
		}
		
		String address = addressTextField.getText();
		String city = cityTextField.getText();
		String state = stateTextField.getText();
		String pin = pinTextField.getText();
		
		
		try {
			if (name.equals("")) {
				JOptionPane.showMessageDialog(null,"Fill The Element");
			}else {
				Conn c = new Conn();
				String querry = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"',  '"+gender+"',  '"+email+"', '"+marital+"', '"+address+"',  '"+city+"',  '"+pin+"',  '"+state+"')";
				c.s.executeUpdate(querry);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}
	
	
	public static void main(String args[]) {
		new SignupOne();
	}
	
}
