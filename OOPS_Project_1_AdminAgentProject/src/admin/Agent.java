package admin;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Agent {
	
	String ch2;
	Scanner sc = new Scanner(System.in);
	ConnectionManager obj = new ConnectionManager();
	public static int newId;
	public void agentLogin() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Statement statement =obj.connection().createStatement();
		System.out.println("\nEnter agent name:");
		String agent_name = sc.nextLine();
		System.out.println("Enter Password:");
		String agent_pass = sc.nextLine();
		ResultSet rs = statement.executeQuery("SELECT agentname,agentpass FROM agentlogin");
		while(rs.next())
		{
			if(agent_name.toString().equals(rs.getString(1)) && agent_pass.toString().equals(rs.getString(2)))
			{
				System.out.println("\nAdmin login successfully...\n");
				agentOperations();
			}
			/*else
			{
				System.out.println("Invalid login");
				agentLogin();
			}*/
		}
		
	}
	public void agentOperations() throws ClassNotFoundException, SQLException
	{
		do {
			System.out.println("Enter agent choices..\n1. Buy/ Sell\n2. Display history\n3. Logout");
			int ch = sc.nextInt();
			switch(ch)
			{
			case 1 : System.out.println("\nBuy/Sell product....\n");
					buySellProd();
					break;
					
			case 2 : System.out.println("\nDisplay History..\n");
					displayHistory();
					break;
					
			case 3 : Main.main(null);
					break;
					
			}
			System.out.println("Do you want to continue..?(yes/no)");
			ch2 = sc.next();
		}while(ch2.equalsIgnoreCase("Yes"));
		if(ch2.equalsIgnoreCase("No"))
		{
			Main.main(null);
		}
		
	}
	//Buy and sell product block starts
	public void buySellProd() throws ClassNotFoundException, SQLException
	{
		System.out.println("Agent is going to BUY/SELL..!!");
		System.out.println("-----------------------------");
		System.out.println("Enter product ID : ");
		newId = sc.nextInt();
		System.out.println("Buy/Sell..??");
		String deal = sc.next();
		java.sql.PreparedStatement ps=null;
		String sql = "UPDATE admin_table SET transaction=? WHERE productID='"+newId+"'";
		ps = obj.connection().prepareStatement(sql);
		ps.setString(1, deal);
		ps.execute();
		//statement.executeUpdate("UPDATE admin_table SET transaction='"+deal+"' WHERE productID='"+newId+"' ");
		//Buy starts
		if(deal.equalsIgnoreCase("buy"))
		{
			int qt1 = 0,pr = 0,qt2=0;
			Statement statement =obj.connection().createStatement();
			ResultSet rs = statement.executeQuery("SELECT productName,price FROM admin_table WHERE productID='"+newId+"' ");
			while(rs.next())
			{
				pr = rs.getInt(2);
				//ResultSet rs = statement.executeQuery("SELECT productID,productName,minSellQuantity,price FROM admin_table");
				System.out.println(rs.getString(1)+"    "+rs.getString(2)+"    ");
			}
			System.out.println("Enter quantity.:");
			int qnty = sc.nextInt();
			ResultSet rs1 = statement.executeQuery("SELECT quantityAvailable FROM admin_table WHERE productID='"+newId+"' ");
			while(rs1.next())
			{
				qt1 = rs1.getInt(1);
				//ResultSet rs = statement.executeQuery("SELECT productID,productName,minSellQuantity,price FROM admin_table");
				//System.out.println(rs.getString(1)+"    "+rs.getString(2)+"    ");
			}
			if(qnty<=qt1)
			{
				int totalcost = qnty*pr;
				System.out.println("Total price : "+totalcost);
				int newqty = qt1-qnty;
				statement.executeUpdate("UPDATE admin_table SET quantityAvailable='"+newqty+"' WHERE productID='"+newId+"' ");
			}
			else
			{
				System.out.println("Out of stock.. ");
			}
		}
		//Buy ends
		//Selling starts
		if(deal.equalsIgnoreCase("sell"))
		{
			int msqt1 = 0,pr = 0,avqt2 = 0;
			Statement statement =obj.connection().createStatement();
			ResultSet rs = statement.executeQuery("SELECT productName,price FROM admin_table WHERE productID='"+newId+"' ");
			while(rs.next())
			{
				pr = rs.getInt(2);
				//ResultSet rs = statement.executeQuery("SELECT productID,productName,minSellQuantity,price FROM admin_table");
				System.out.println(rs.getString(1)+"    "+rs.getString(2)+"    ");
			}
			System.out.println("Enter quantity.:");
			int qnty = sc.nextInt();
			statement.executeUpdate("UPDATE admin_table SET newQuantity='"+qnty+"' WHERE productID='"+newId+"' ");
			ResultSet rs1 = statement.executeQuery("SELECT minSellQuantity FROM admin_table WHERE productID='"+newId+"' ");
			while(rs1.next())
			{
				msqt1 = rs1.getInt(1);
				
				//ResultSet rs = statement.executeQuery("SELECT productID,productName,minSellQuantity,price FROM admin_table");
				//System.out.println(rs.getString(1)+"    "+rs.getString(2)+"    ");
			}
			ResultSet rs2 = statement.executeQuery("SELECT quantityAvailable FROM admin_table WHERE productID='"+newId+"' ");
			while(rs2.next())
			{
				
				avqt2 = rs2.getInt(1);
				//ResultSet rs = statement.executeQuery("SELECT productID,productName,minSellQuantity,price FROM admin_table");
				//System.out.println(rs.getString(1)+"    "+rs.getString(2)+"    ");
			}
			if(qnty>=msqt1)
			{
				int totalcost = qnty*pr;
				System.out.println("Total price : "+totalcost);
				int newqty = avqt2+qnty;
				statement.executeUpdate("UPDATE admin_table SET quantityAvailable='"+newqty+"' WHERE productID='"+newId+"' ");
			}
			else
			{
				System.out.println("Min sell quantity is greater..");
			}
		}
		//Sell ends	
		//return newId;
	}
	//Buy and sell product block starts
	//Displaying history of dealings starts
	public void displayHistory() throws ClassNotFoundException, SQLException
	{
		System.out.println("Transaction History..");
		System.out.println("-------------------------------");
		Statement statement =obj.connection().createStatement();
		ResultSet rs = statement.executeQuery("SELECT productID,productName,transaction,quantityAvailable,price,totalCost FROM admin_table WHERE productID='"+newId+"' ");
		while(rs.next())
		{
			//ResultSet rs = statement.executeQuery("SELECT productID,productName,minSellQuantity,price FROM admin_table");
			System.out.println(rs.getString(1)+"    "+rs.getString(2)+"    "+rs.getString(3)+"    "+rs.getString(4)+"    "+rs.getString(5)+"    ");
		}
		System.out.println("-------------------------------");
		
	}
	
	
}
