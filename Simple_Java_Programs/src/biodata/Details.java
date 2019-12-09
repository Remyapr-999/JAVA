package biodata;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Details {
	
	public void display(String name,String age,String degree,String branch,String contact)
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Degree : "+degree);
		System.out.println("Branch : "+branch);
		System.out.println("Contact : "+contact);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String name;
		String age;
		String degree;
		String branch;
		String contact;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your Name:");
		name = br.readLine();
		System.out.println("Enter your age:");
		age = br.readLine();
		System.out.println("Enter your Degree:");
		degree = br.readLine();
		System.out.println("Enter your Branch:");
		branch = br.readLine();
		System.out.println("Enter your Contact Number:");
		contact = br.readLine();
		Details dt = new Details();
		dt.display(name,age,degree,branch,contact);
		
	}

}
