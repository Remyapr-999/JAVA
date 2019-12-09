package admin;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Admin admin = new Admin();
		Agent agent = new Agent();
		//ConnectionManager.connection();
		int choice;
		System.out.println("Enter your choice\n1. Admin Login\n2. Agent Login\n3. Exit1");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		switch(choice)
		{
		case 1 : System.out.println("Admin Login");
		 		admin.adminLogin();
		 		break;
		 		
		case 2 : System.out.println("Agent Login");
				agent.agentLogin();
				break;
				
		case 3 : System.out.println("\nExiting..\nThank you...!!!");
				System.exit(0);
		
		}

	}

}
