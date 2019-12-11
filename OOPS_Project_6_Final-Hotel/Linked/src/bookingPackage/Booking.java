package bookingPackage;

import java.util.ArrayList;

import java.util.Scanner;

import customerPackage.Customer;
import registerPackage.Registration;

public class Booking {
	String ac,cot,cable,wifi,laundry,ch,ch1;
	static int total=0;	
	int date;
	static int value,i,flag=0,indx=0,roomNo=0,indx1=0;
	ArrayList<Integer> dateArray = new ArrayList<Integer>();
	//ArrayList<Integer> bookedArray = new ArrayList<Integer>();
	ArrayList<Integer> roomArray = new ArrayList<Integer>();
	//bookedArray.add(Object 1);
	int[] bookedArray = new int[25];
	Customer cus = new Customer();
	Scanner sc= new Scanner(System.in);
	public void book()
	{  
		// TODO Auto-generated method stub
		
				System.out.println("\n********* ROOM BOOKING ******\n  ");
				System.out.println("Please choose the services:"+"AC/non-AC(AC/nAC)");
				ac=sc.nextLine();
				cus.setAc(ac);
				if(cus.getAc().equalsIgnoreCase("AC"))
				{
					total=1000;
				}
				else
				{
					total=750;
				}
				System.out.println("Cot(Single/Double):");
				cot=sc.nextLine();
				cus.setCot(cot);
				if(cus.getCot().equalsIgnoreCase("Single"))
				{
					total=total+0;
				}
				else
				{
					total=total+350;
				}
				System.out.println("With cable connection/without cable connection(C/nC):");
				cable=sc.nextLine();
				cus.setCable(cable);
				if((cus.getCable().equalsIgnoreCase("With cable connection"))||(cable.equals("C")))
				{
					total=total+50;
				}
				else
				{
					total=total+0;
				}
				System.out.println("Wi-Fi needed or not(W/nW):");
				wifi=sc.nextLine();
				cus.setWifi(wifi);
				if((cus.getWifi().equalsIgnoreCase("Wi-Fi needed"))||(wifi.equals("W")))
				{
					total=total+200;
				}
				else
				{
					total=total+0;
				}
				System.out.println("Laundry service needed or not(L/nL):");
				laundry=sc.nextLine();
				cus.setLaundry(laundry);
				if((cus.getLaundry().equalsIgnoreCase("Laundry service needed"))||(laundry.equals("L")))
				{
					total=total+100;
				}
				else
				{
					total=total+0;
				}
				System.out.println("Enter date :");
				date = sc.nextInt();
				//dateArray[indx1] = date;
				dateArray.add(indx1,date);
				System.out.println("Total charge is:"+total);
				System.out.println("The services choosen are");
				System.out.println(cus.getCot()+" Cot "+cus.getAc()+" Room");
				System.out.println(cus.getCable()+" connection enabled");
				System.out.println(cus.getWifi()+" enabled");
				System.out.println(cus.getLaundry()+" needed");
				bookedArray[indx] = 1;
				indx++;
				System.out.println("\nThank you for booking. Your room number is "+ ++roomNo);
				//roomArray[indx1] = roomNo;
				roomArray.add(roomNo);
				++indx1;			
			
	}
	
	public void status()
	{
		System.out.println("***** CHECKING STATUS ******\n");
		System.out.println("Enter room number ");
		int room = sc.nextInt();
		if(bookedArray[room-1]==1)
		{
			System.out.println("Room "+room+" already booked  ");
		}
		else
		{
			System.out.println("Room "+room+" not booked  ");
		}
		
	}
	
	public void allBooking()
	{
		System.out.println("Enter the start date : ");
		int start = sc.nextInt();
		System.out.println("Enter the end date : ");
		int end = sc.nextInt();
		System.out.println("The bookings made from "+start+" to "+end+" are..\n");
		System.out.println("Room number   "+"Customer ID");
		int ind = 0;
		for(int k=0;k<indx1;k++)
		{
			if((dateArray.get(k)>=start && dateArray.get(k)<=end)||dateArray.get(k)<=start && dateArray.get(k)>=end)
			{
			System.out.println("    "+roomArray.get(k)+"            "+ Registration.registerIdArray.get(k));//Need to edit
			}
		}
		
	}
	
	

}
