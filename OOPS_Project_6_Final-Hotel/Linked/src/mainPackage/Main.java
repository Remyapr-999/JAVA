package mainPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

import bookingPackage.Booking;
import registerPackage.Registration;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String first_name;
		String middlie_name;
		String last_name;
		String address;
		String contact;
		String email;
		String proofType;
		String proofID;
		int choice;
		String menu,ed;
		Registration reg = new Registration();
		Booking bk = new Booking();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do
		{
			System.out.println("\nENTER YOUR CHOICE : \n");
			System.out.println("1. Register."+"\n"+"2. Book."+"\n"+"3. Check Status."+"\n"+"4. Email."+"\n"+"5. All Bookings."+"\n"+"6. All Customers."+"\n"+"7. Exit.");
			choice = Integer.parseInt(br.readLine());
			
			switch(choice)
			{
			case 1 : 
					System.out.println("Enter first name:");
					first_name=br.readLine();
					
					System.out.println("Enter middle name:");
					middlie_name=br.readLine();
					
					System.out.println("Enter last name:");
					last_name=br.readLine();
					
					System.out.println("Enter email:");
					email=br.readLine();
					
					System.out.println("Enter contact number:");
					contact=br.readLine();
					
					System.out.println("Enter address:");
					address=br.readLine();
					
					System.out.println("Enter proof Type:");
					proofType=br.readLine();
					
					System.out.println("Enter proof ID:");
					proofID=br.readLine();
					
					reg.register(first_name, middlie_name, last_name, address, contact, email, proofType,proofID);
					
					break;
			case 2 : 
					bk.book();
					break;
					
			case 3 : 
					bk.status();
					break;
					
			case 4 : 
					System.out.println("Do you want to update the email id?(Y/N)");
					ed=br.readLine();
					
					if(ed.equalsIgnoreCase("Y"))
					{
					System.out.println("\n***** UPDATE E-MAIL *******\n");
					System.out.println("Enter your ID : ");
					int id = Integer.parseInt(br.readLine());
					System.out.println("Enter new Email id:");
					email = br.readLine();	
					reg.emailupdate(email,id);	
					}
					break;
					
			case 5 : 
					bk.allBooking();
					break;
					
			case 6 : 
					reg.allCustomers();
					break;
					
			case 7 : 
					System.out.println("Thank You..!!\nHave a nice Day...!!");
					System.exit(0);
					break;
			
			}
			System.out.println("\nDo you want main menu ??(Yes/No)");
			menu = br.readLine();
			
		}while(menu.equalsIgnoreCase("yes"));
		
		

	}

}
