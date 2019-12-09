package admin;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class Admin {
	
	String ch2;
	Scanner sc = new Scanner(System.in);
	ConnectionManager obj = new ConnectionManager();
	public void adminLogin() throws ClassNotFoundException, SQLException
	{
		Statement statement =obj.connection().createStatement();
		System.out.println("\nEnter Admin user name:");
		String ad_user = sc.nextLine();
		System.out.println("Enter Password:");
		String ad_pass = sc.nextLine();
		ResultSet rs = statement.executeQuery("SELECT ad_username,ad_password FROM adminlogin");
		while(rs.next())
		{
			if(ad_user.toString().equals(rs.getString(1)) && ad_pass.toString().equals(rs.getString(2)))
			{
				System.out.println("\nAdmin login successfully...\n");
				admin_operations();
			}
			else
			{
				System.out.println("Invalid login");
				adminLogin();
			}
		}
	}
	public void admin_operations() throws ClassNotFoundException, SQLException
	{
		do {
			System.out.println("Enter admin choices..\n1. Add Product\n2. Display inventory details\n3. Logout");
			int ch = sc.nextInt();
			switch(ch)
			{
			case 1 : System.out.println("\nAdding product....\n");
					addProdct();
					break;
					
			case 2 : System.out.println("\nDisplay inventory details..\n");
					displayProduct();
					break;
					
			case 3 : Main.main(null);
					break;
					
			
			}
			System.out.println("Do you want to continue..?");
			ch2 = sc.next();
		}while(ch2.equalsIgnoreCase("Yes"));
		if(ch2.equalsIgnoreCase("No"))
		{
			Main.main(null);
		}
	}
	public void addProdct() throws ClassNotFoundException, SQLException
	{
		String proName;
		int proID,msq,pric;
		System.out.println("Enter product ID : ");
		proID = sc.nextInt();
		System.out.println("Enter product name : ");
		proName = sc.next();
		System.out.println("Enter minimum sell quantity : ");
		msq = sc.nextInt();
		System.out.println("Enter price : ");
		pric = sc.nextInt();
		
		//Statement statement =obj.connection().createStatement();
		java.sql.PreparedStatement ps=null;
		//ResultSet rs = statement.executeQuery("SELECT ad_username,ad_password FROM adminlogin");
		String sql = "INSERT INTO admin_table(productID,productName,minSellQuantity,price,newQuantity,transaction) VALUES(?,?,?,?,?,?)";
		ps = obj.connection().prepareStatement(sql);
		ps.setInt(1, proID);
		ps.setString(2, proName);
		ps.setInt(3, msq);
		ps.setInt(4, pric);
		ps.setInt(5, 0);
		ps.setString(6, "null");
		ps.execute();
		}
	public void displayProduct() throws ClassNotFoundException, SQLException
	{
		int p =0,q=0;
		System.out.println("Enter product ID : ");
		int newId = sc.nextInt();
		System.out.println("Enter product name : ");
		String newName = sc.next();
		System.out.println("Enter quantity available : ");
		int newQua = sc.nextInt();
		Statement statement =obj.connection().createStatement();
		statement.executeUpdate("UPDATE admin_table SET newQuantity='"+newQua+"' WHERE productID='"+newId+"' && productName='"+newName+"' ");
		ResultSet rs2 = statement.executeQuery("SELECT quantityAvailable FROM admin_table WHERE productID='"+newId+"' && productName='"+newName+"' ");
		while(rs2.next())
		{
		q = rs2.getInt(1);
		}
		int newavail = newQua+q;
		statement.executeUpdate("UPDATE admin_table SET quantityAvailable='"+newavail+"' WHERE productID='"+newId+"' && productName='"+newName+"' ");
		ResultSet rs1 = statement.executeQuery("SELECT price FROM admin_table WHERE productID='"+newId+"' && productName='"+newName+"' ");
		while(rs1.next())
		{
		p = rs1.getInt(1);
		}
		
		int total = newavail*p;
		statement.executeUpdate("UPDATE admin_table SET totalCost='"+total+"' WHERE productID='"+newId+"' && productName='"+newName+"' ");
		//System.out.println("ProductID"+"    ProductName"+"   QuantityAvailable"+"   Price"+"   TotalCost\n");
		System.out.println("----------------------------");
		ResultSet rs = statement.executeQuery("SELECT productID,productName,quantityAvailable,price,totalCost FROM admin_table");
		while(rs.next())
		{
			//ResultSet rs = statement.executeQuery("SELECT productID,productName,minSellQuantity,price FROM admin_table");
			System.out.println(rs.getString(1)+"    "+rs.getString(2)+"    "+rs.getString(3)+"    "+rs.getString(4)+"    "+rs.getString(5));
		}
		System.out.println("----------------------------");
	}

}
