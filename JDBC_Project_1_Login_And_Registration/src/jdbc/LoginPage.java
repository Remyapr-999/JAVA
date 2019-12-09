package jdbc;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;

import com.mysql.jdbc.Connection;


public class LoginPage {
	
	//public void log()
	public static void main(String[] args) throws ClassNotFoundException, SQLException  
	{
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/registration","root","");
		Statement statement =con.createStatement();
		
		
		
		JFrame jf =  new JFrame("Login Page");
		jf.setSize(500, 600);
		jf.setLayout(null);
		jf.setVisible(true);
		jf.setContentPane(new JLabel(new ImageIcon("C:\\Users\\user_2\\eclipse\\java-2019-03\\eclipse\\Chrysanthemum.jpg")));
		//jf.setBackground(Color.blue);
		
		JLabel username,passwrd;
		
		username = new JLabel("User name. : ");
		passwrd = new JLabel("Password : ");
		
		username.setBounds(50, 50, 100, 100);
		passwrd.setBounds(50, 100, 100, 100);
		
		jf.add(username);
		jf.add(passwrd);
		
		final JTextField tfusername,tfpasswrd;
		
		tfusername = new JTextField();
		tfpasswrd = new JTextField();
		
		tfusername.setBounds(150, 90, 150, 30);
		tfpasswrd.setBounds(150, 140, 150, 30);
		
		jf.add(tfusername);
		jf.add(tfpasswrd);
		
		JButton signIn = new JButton("Sign In");
		signIn.setBounds(150, 300, 100, 30);
		jf.add(signIn);
		
		JButton signUp = new JButton("Sign Up");
		signUp.setBounds(250, 300, 100, 30);
		jf.add(signUp);
		
		
		signUp.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				try {
					RegistrationForm.registerMethod();
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		signIn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				try {
					
					ResultSet rs = statement.executeQuery("SELECT username,passwrd FROM register");
					int count = 0;
					while(rs.next())
					{
						if(tfusername.getText().equals(rs.getString(1)) && tfpasswrd.getText().equals(rs.getString(2)))
						{
							//System.out.println("Successfully login...!!");
							JLabel success = new JLabel("Congarts...\nSuccessfully login...!!");
							success.setBounds(100, 190, 200, 50);
							jf.add(success);
							count = 1;
							break;
						}
					}
					if(count == 0)
					{
						JLabel success = new JLabel("Invalid login..!! \nPlease signup ..!!");
						success.setBounds(100, 190, 200, 50);
						jf.add(success);
						//System.out.println("Invalid login");
						
					}
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
	}

}
