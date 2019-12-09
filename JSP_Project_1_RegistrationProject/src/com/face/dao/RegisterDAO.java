package com.face.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.face.bo.RegisterBO;

public class RegisterDAO {
	public static boolean save(Connection connection,RegisterBO regbo) throws SQLException{
		
		boolean status;
		Statement st = connection.createStatement();
		String query = "INSERT INTO register VALUES('"+regbo.getName()+"','"+regbo.getEmail()+"','"+regbo.getPhone()+"','"+regbo.getPassword()+"','"+regbo.getPlace()+"');";
		int resultset = st.executeUpdate(query);
		if(resultset == 1)
		{
			//System.out.println("Data inserted successfully");
			status = true;
		}
		else {
			status = false;
		}
		return status;
	}

}
