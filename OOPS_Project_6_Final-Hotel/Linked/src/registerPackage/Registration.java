package registerPackage;

import java.util.ArrayList;

import customerPackage.Customer;
import mainPackage.Main;
public class Registration {
	String emailNew;
	static int regID=0,indx;
	Customer cus = new Customer();
	ArrayList<String> first_name = new ArrayList<String>();
	ArrayList<String> middlie_name = new ArrayList<String>();
	ArrayList<String> last_name = new ArrayList<String>();
	ArrayList<String> email = new ArrayList<String>();
	ArrayList<String> contact = new ArrayList<String>();
	ArrayList<String> address = new ArrayList<String>();
	ArrayList<String> proofType = new ArrayList<String>();
	ArrayList<String> proofID = new ArrayList<String>();
	public static ArrayList<Integer> registerIdArray = new ArrayList<Integer>();
	
	public void register(String first_name1, String middlie_name1, String last_name1, String address1, String contact1, String email1, String proofType1,String proofID1)
	{
		cus.setFirst_name(first_name1);
		first_name.add(cus.getFirst_name());
		cus.setMiddlie_name(middlie_name1);
		middlie_name.add(cus.getMiddlie_name());
		cus.setLast_name(last_name1);
		last_name.add(cus.getLast_name());
		cus.setEmail(email1);
		email.add(cus.getEmail());
		cus.setAddress(address1);
		address.add(cus.getAddress());
		cus.setContact(contact1);
		contact.add(cus.getContact());
		cus.setProofType(proofType1);
		proofType.add(cus.getProofType());
		cus.setProofID(proofID1);
		proofID.add(cus.getProofID());
		System.out.println("\nThank you for registration..!!");
		System.out.println("\nYOUR DETAILS ARE ...\n");
		this.display();
	}
	
	public void display()
	{
		//System.out.println("Name : "+););
		System.out.println("Middle Name : "+cus.getFirst_name());
		System.out.println("Middle Name : "+cus.getMiddlie_name());
		System.out.println("Last Name : "+cus.getLast_name());
		System.out.println("E-Mail : "+cus.getEmail());
		System.out.println("Phone Number : "+cus.getContact());
		System.out.println("Address : "+cus.getAddress());
		System.out.println("Proof Type : "+cus.getProofType());
		System.out.println("Proof ID : "+cus.getProofID());
		System.out.println("Your registration No. is "+ ++regID);
		registerIdArray.add(regID);
		indx++;
		
	}
	
	public void emailupdate(String email1,int id)
	{
		
		cus.setEmail(email1);
		//emailNew = cus.getEmail();
		email.add(id-1,cus.getEmail());
		//System.out.println(cus.getEmail());
		
		//Main.emailArray[indx] = emailNew;
		System.out.println("\nEmail updated......!!!!\n");
		
		//System.out.println("New mail ID : "+cus.getEmail());
		this.displayUpdate(id);
	}
	
	public void displayUpdate(int id)
	{
		System.out.println("First Name : "+first_name.get(id-1));
		System.out.println("Middle Name : "+middlie_name.get(id-1));
		System.out.println("Last Name : "+last_name.get(id-1));
		System.out.println("E-Mail : "+email.get(id-1));
		System.out.println("Phone Number : "+contact.get(id-1));
		System.out.println("Address : "+address.get(id-1));
		System.out.println("Proof Type : "+proofType.get(id-1));
		System.out.println("Proof ID : "+proofID.get(id-1));
		System.out.println("Your registration No. is "+ id);
		
		//indx++;
		
	}
	
	public void allCustomers()
	{
		System.out.println("********* REGISTERED CUSTOMERS **********\n");
		System.out.println("Customer ID   "+"   Customer Name");
		for(int k=0;k<indx;k++)
		{
			
			System.out.println("     "+registerIdArray.get(k)+"             "+first_name.get(k));
			
		}
		
	}
	

}
