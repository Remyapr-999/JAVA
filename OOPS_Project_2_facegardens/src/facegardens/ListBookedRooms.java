package facegardens;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class ListBookedRooms {
	static int total=0;	
	int date;
	String ac,cot,cable,wifi,laundry,ch,ch1;
	static int value,i,flag=0,indx=0,roomNo;
	static int []booked = new int[25];
	Scanner s= new Scanner(System.in);
	//void checkStatus() throws IOException
	//{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		Registration regst = new Registration();
		
		public void roomBookHere() throws IOException
		{
			System.out.println("\n*********ROOM BOOKING******\n  ");
			System.out.println("Please choose the services:"+"AC/non-AC(AC/nAC)");
			ac=sc.nextLine();
			if(ac.equalsIgnoreCase("AC"))
			{
				total=1000;
			}
			else
			{
				total=750;
			}
			System.out.println("Cot(Single/Double):");
			cot=sc.nextLine();
			if(cot.equalsIgnoreCase("Single"))
			{
				total=total+0;
			}
			else
			{
				total=total+350;
			}
			System.out.println("With cable connection/without cable connection(C/nC):");
			cable=sc.nextLine();
			if((cable.equalsIgnoreCase("With cable connection"))||(cable.equals("C")))
			{
				total=total+50;
			}
			else
			{
				total=total+0;
			}
			System.out.println("Wi-Fi needed or not(W/nW):");
			wifi=sc.nextLine();
			if((wifi.equalsIgnoreCase("Wi-Fi needed"))||(wifi.equals("W")))
			{
				total=total+200;
			}
			else
			{
				total=total+0;
			}
			System.out.println("Laundry service needed or not(L/nL):");
			laundry=sc.nextLine();
			if((laundry.equalsIgnoreCase("Laundry service needed"))||(laundry.equals("L")))
			{
				total=total+100;
			}
			else
			{
				total=total+0;
			}
			System.out.println("Enter the date of booking : ");
			date = sc.nextInt();
			System.out.println("Total charge is:"+total);
			System.out.println("The services choosen are");
			System.out.println(cot+" Cot "+ac+" Room");
			System.out.println(cable+" connection enabled");
			System.out.println(wifi+" enabled");
			System.out.println(laundry+" needed");
	
			//System.out.println("Thank you for booking. Your room number is "+ ++roomNo);
			//System.out.println("Do you want to continue:");
			//ch=br.readLine();
			//value=roomNo;
			//booked[indx] = value;
			//	indx++;
		}
		
		public void viewBookings() {
			// TODO Auto-generated method stub
			System.out.println("\n******* VIEWING CUSTOMERS********\n");
			System.out.println("Enter the start date");
			int startDate = sc.nextInt();
			System.out.println("Enter the end date");
			int endDate = sc.nextInt();
			System.out.println("The bookings made from "+startDate+" to "+endDate+" are");
			
		}
		
		
		
		public void menuOptions() throws IOException 
		{
		
		do {
		System.out.println("\n*** MENU ***\n");
		System.out.println("1. Register."+"\n"+"2. Book."+"\n"+"3. Check Status."+"\n"+"4. Email."+"\n"+"5. All Bookings."+"\n"+"6. All Customers."+"\n"+"7. Exit.");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1 : regst.registerDetails();
			/*do {
				
				System.out.println("\n*********ROOM BOOKING******\n  ");
				System.out.println("Please choose the services:"+"AC/non-AC(AC/nAC)");
				ac=sc.nextLine();
				if(ac.equalsIgnoreCase("AC"))
				{
					total=1000;
				}
				else
				{
					total=750;
				}
				System.out.println("Cot(Single/Double):");
				cot=sc.nextLine();
				if(cot.equalsIgnoreCase("Single"))
				{
					total=total+0;
				}
				else
				{
					total=total+350;
				}
				System.out.println("With cable connection/without cable connection(C/nC):");
				cable=sc.nextLine();
				if((cable.equalsIgnoreCase("With cable connection"))||(cable.equals("C")))
				{
					total=total+50;
				}
				else
				{
					total=total+0;
				}
				System.out.println("Wi-Fi needed or not(W/nW):");
				wifi=sc.nextLine();
				if((wifi.equalsIgnoreCase("Wi-Fi needed"))||(wifi.equals("W")))
				{
					total=total+200;
				}
				else
				{
					total=total+0;
				}
				System.out.println("Laundry service needed or not(L/nL):");
				laundry=sc.nextLine();
				if((laundry.equalsIgnoreCase("Laundry service needed"))||(laundry.equals("L")))
				{
					total=total+100;
				}
				else
				{
					total=total+0;
				}
				System.out.println("Total charge is:"+total);
				System.out.println("The services choosen are");
				System.out.println(cot+" Cot "+ac+" Room");
				System.out.println(cable+" connection enabled");
				System.out.println(wifi+" enabled");
				System.out.println(laundry+" needed");
		
				System.out.println("Thank you for booking. Your room number is "+ ++roomNo);
				System.out.println("Do you want to continue:");
				ch=br.readLine();
				value=roomNo;
				booked[indx] = value;
					indx++;
			}while(ch.contentEquals("Y"));*/
			
				break;
		case 2 : 
		{
				System.out.println("*****CHECKING STATUS******\n");
				System.out.println("Enter room number ");
				int room = s.nextInt();
				for(i=0;i<=value;i++)
				{
					if(booked[i] == room)
					{
						System.out.println("Room "+room+" already booked  ");
						flag=1;
						break;
						
					}
					
				}
				if(flag==0)
				{
					System.out.println("Room "+room+"  is available...!!  ");
				}
				break;
		}
		case 3 : System.out.println("Thank you..!!");
				System.exit(0); 
				break;
		
				
			}
		System.out.println("Do you want menu.......??");
		ch1=br.readLine();
		}while(ch1.contentEquals("Y"));
	}
	
		}

		

