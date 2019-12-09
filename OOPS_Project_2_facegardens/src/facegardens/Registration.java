package facegardens;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//reg
public class Registration {
	String name;
	String address;
	String contact;
	String email;
	String proofType;
	String proofID;
	static int registerID=0;
	int lp,pos=0,p;
	String names[] = new String[25];
	String i,ed,rom,proc;
	Customer1 cus = new Customer1();
	public void registerDetails() throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	do {
		System.out.println("\n***** REGISTER HERE ******\n");
	System.out.println("Enter name:");
	name = br.readLine();
	names[pos]=name;
	pos++;
	System.out.println("Enter address:");
	address = br.readLine();
	System.out.println("Enter contact:");
	contact = br.readLine();
	System.out.println("Enter email:");
	email = br.readLine();
	System.out.println("Enter proof Type:");
	proofType = br.readLine();
	System.out.println("Enter proofID:");
	proofID = br.readLine();
	System.out.println(++registerID);
	
	//Customer1 cus = new Customer1();
	cus.setName(name);
	cus.setAddress(address);
	cus.setContact(contact);
	cus.setEmail(email);
	cus.setProofType(proofType);
	cus.setProofID(proofID);
	cus.register();	
	
	//EMAIL UPDATION
	/*System.out.println("Do you want to update the email id?(Y/N)");
	ed=br.readLine();
	if(ed.contentEquals("Y"))
	{
	System.out.println("\n***** UPDATE E-MAIL *******\n");
	System.out.println("Enter new Email id:");
	email = br.readLine();
	cus.setEmail(email);
	System.out.println("\nEmail updated......!!!!\n");
	System.out.println("Your details are as follows...\n");
	cus.registerNew();
	
	}*/
	//EMAIL UPDATION
	/*System.out.println("Do you want to book a room (y/n)?");
	rom=br.readLine();
	if(rom.contentEquals("Y"))
	{
		lbr.roomBookHere();
	
		System.out.println("Do you want to proceed?(yes/no)");
		proc=br.readLine();
		if(proc.contentEquals("Y"))
		{
			System.out.println("Thank you for booking. Your room number is "+registerID);
		}
	}*/
	System.out.println("Do you want to continue registration:");
	i=br.readLine();
	}while(i.contentEquals("Y"));
	}

}
