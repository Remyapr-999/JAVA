package com.face.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.face.bo.LoginBO;

public class LoginDAO {
	

	public static java.util.List save(Connection connection, LoginBO lbo) throws SQLException {
		
		ArrayList arl = new ArrayList();
		boolean checkStatus = false;
		Statement st = connection.createStatement();
		String ent_name = lbo.getUsername();	
		String ent_pas = lbo.getPasswrd();
		ResultSet rs = st.executeQuery("select name,password from register");
		int c=0;
		while(rs.next())
		{
			if(ent_name.toString().equals(rs.getString(1)) && ent_pas.toString().equals(rs.getString(2)))
			{
				checkStatus=true;
				c=1;
				break;						
			}
		}
		if(c==0)
			checkStatus=false;
		
		if(checkStatus == true)
		{
			ResultSet rs1 = st.executeQuery("select name,email,phone,place from register where name='"+ent_name+"'");
			//String one = null,two = null,three = null,four = null;
			while(rs1.next())
			{
				arl.add(rs1.getString(1));
				arl.add(rs1.getString(2));
				arl.add(rs1.getString(3));
				arl.add(rs1.getString(4));
				
			}
	
		}
		
		
		return arl;
	}
}
