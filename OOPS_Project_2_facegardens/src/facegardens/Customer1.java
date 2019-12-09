package facegardens;

public class Customer1 {
	String name;
	String address;
	String contact;
	String email;
	String proofType;
	String proofID;
	static int registerID=0;
	//public Customer1(String name,String address,String contact,String email,String proofType,String proofID)
	//{
		//this.name=name;
		//this.address = address;
	//	this.contact = contact;
	//	this.email = email;
	//	this.proofType = proofType;
	//	this.proofID = proofID;
	//}
	

	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProofType() {
		return proofType;
	}
	public void setProofType(String proofType) {
		this.proofType = proofType;
	}
	public String getProofID() {
		return proofID;
	}
	public void setProofID(String proofID) {
		this.proofID = proofID;
	}
	public void register()
	{
		System.out.println("\n********* YOUR DETAILS *********\n");
		System.out.println("Name :"+name+"\nAddress : "+address+"\nContact Number : "+contact+"\nE-Mail : "+email+"\nProof Type : "+proofType+"\nProof ID : "+proofID);
		System.out.println("Thank u for registering.Your ID is "+ ++registerID+"\n");
		
	}
	public void registerNew()
	{
		System.out.println("Name :"+name+"\nAddress : "+address+"\nContact Number : "+contact+"\nE-Mail : "+email+"\nProof Type : "+proofType+"\nProof ID : "+proofID);
		//System.out.println("Thank u for registering.Your ID is "+ registerID);
		
	}
	

}
