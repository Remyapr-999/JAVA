package admin;


import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class ConnectionManager {
	public Connection connection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/adminagent","root","");  
				
		if (con != null)
				{
					//System.out.println("Connected");
					return con;
				}
				else
				{
					System.out.println("not Connected");
					return null;
				}
	}

}
