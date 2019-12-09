package jdbc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class RegistrationForm {
	public static void registerMethod() throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.jdbc.Driver");  
	Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/registration","root","");  
	
	/*if (con != null)
	{
		System.out.println("Connected");
	}
	else
	{
		System.out.println("not Connected");
	}*/

	Statement statement =(Statement) con.createStatement();
	
	JFrame jf =  new JFrame("Registration");
	jf.setSize(500, 600);
	jf.setLayout(null);
	jf.setVisible(true);
	
	JLabel fname,lname,email,phone,username,passwrd;
	fname = new JLabel("First Name : ");
	lname = new JLabel("Last Name : ");
	email = new JLabel("Email ID : ");
	phone = new JLabel("Phone No. : ");
	username = new JLabel("User name. : ");
	passwrd = new JLabel("Password : ");
	
	fname.setBounds(50, 50, 100, 100);
	lname.setBounds(50, 100, 100, 100);
	email.setBounds(50, 150, 100, 100);
	phone.setBounds(50, 200, 100, 100);
	username.setBounds(50, 250, 100, 100);
	passwrd.setBounds(50, 300, 100, 100);
	
	jf.add(fname);
	jf.add(lname);
	jf.add(email);
	jf.add(phone);
	jf.add(username);
	jf.add(passwrd);
	
	final JTextField tffname,tflname,tfemail,tfphone,tfusername,tfpasswrd;
	tffname = new JTextField();
	tflname = new JTextField();
	tfemail = new JTextField();
	tfphone = new JTextField();
	tfusername = new JTextField();
	tfpasswrd = new JTextField();
	
	tffname.setBounds(150, 90, 150, 30);
	tflname.setBounds(150, 130, 150, 30);
	tfemail.setBounds(150, 180, 150, 30);
	tfphone.setBounds(150, 220, 150, 30);
	tfusername.setBounds(150, 260, 150, 30);
	tfpasswrd.setBounds(150, 300, 150, 30);
	
	jf.add(tffname);
	jf.add(tflname);
	jf.add(tfemail);
	jf.add(tfphone);
	jf.add(tfusername);
	jf.add(tfpasswrd);
	
	JButton submit = new JButton("SUBMIT");
	submit.setBounds(150, 400, 100, 30);
	jf.add(submit);
	
	JButton exit = new JButton("EXIT");
	exit.setBounds(250, 400, 100, 30);
	jf.add(exit);
	
	submit.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			String fn = tffname.getText();
			String ln = tflname.getText();
			String eml= tfemail.getText();
			String phn = tfphone.getText();
			String user = tfusername.getText();
			String pass = tfpasswrd.getText();
			
			
			try {
				statement.executeUpdate("INSERT INTO register VALUES('"+fn+"','"+ln+"','"+eml+"','"+phn+"','"+user+"','"+pass+"')");
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

		}
	});
	
	
exit.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			System.exit(0);
			

		}
	});
	
	}

}
