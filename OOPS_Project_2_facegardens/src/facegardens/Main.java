package facegardens;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	String name;
	String address;
	String contact;
	String email;
	String proofType;
	String proofID;
	static int registerID=0;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String name;
		String address;
		String contact;
		String email;
		String proofType;
		String proofID;
		String i,ed,rom,proc;
		String names[] = new String[25];
		int lp,pos=0,p;
		
		ListBookedRooms lbr = new ListBookedRooms();
		lbr.menuOptions();
		
			
		/*if(i.contentEquals("N"))
		{	
			lbr.viewBookings();
		}*/
		
		System.out.println("Customer ID "+" Customer name");
		p=0;
		for(lp=1;lp<=registerID;lp++)
		{
			
			System.out.println(lp+"             " + names[p]);
			p++;
		}
		
		//CUSTOMER LISTS
		
		/*if(i.contentEquals("N"))
		{			
				System.out.println("\n***** CUSTOMERS LIST******\n");
				System.out.println("The registered customers are\n");
				//public void viewCustomers()
				{
					System.out.println("Customer ID "+" Customer name");
					p=0;
					for(lp=1;lp<=registerID;lp++)
					{
						
						System.out.println(lp+"             " + names[p]);
						p++;
					}
				}
		}*/
		
		//CUSTOMER LISTS
		
		//ListBookedRooms lbr = new ListBookedRooms();
		//lbr.checkStatus();
		
		

	}

}
