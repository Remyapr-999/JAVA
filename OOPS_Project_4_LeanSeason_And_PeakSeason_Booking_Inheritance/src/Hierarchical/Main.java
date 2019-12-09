package Hierarchical;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int person;
		int total_days;
		double tariff;
		int month;
		double value,value1;
		String roomType;
		int peakCharges,discount;
		PeakSeason ps = new PeakSeason();
		LeanSeason ls = new LeanSeason();
		Booking bk = new Booking();
		System.out.println("Booking");
		System.out.println("Enter number of persons : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		person = Integer.parseInt(br.readLine());
		ps.setPerson(person);
		System.out.println("Enter the number of days : ");
		total_days = Integer.parseInt(br.readLine());
		ps.setTotal_days(total_days);
		
		System.out.println("Enter the room type : ");
		roomType = br.readLine();
		ps.setRoomType(roomType);
		System.out.println("Enter the month : ");
		month = Integer.parseInt(br.readLine());
		bk.setMonth(month);
		
		if(month==4 || month==5 || month==6 || month==9 || month==11 || month==12)
		{
			System.out.println("Enter the peak Charge : ");
			peakCharges = Integer.parseInt(br.readLine());
			System.out.println("Enter the tariff for single person : ");
			tariff = Integer.parseInt(br.readLine());
			ps.setTariff(tariff);
			value = ps.roomBooking(person,total_days,roomType,month,peakCharges);
			System.out.println("Total Tariff : "+value);
			
		}
		if(month==1 || month==2 || month==3 || month==7 || month==8 | month==12)
		{
			System.out.println("Enter the discount : ");
			discount = Integer.parseInt(br.readLine());
			ps.setDiscount(discount);
			System.out.println("Enter the tariff for single person : ");
			tariff = Integer.parseInt(br.readLine());
			ps.setTariff(tariff);
			value1 = ls.roomBooking(person,total_days,roomType,month,discount,tariff);
			System.out.println("Total Tariff : "+value1);
		}
		
		
		
		//double d = ps.roomBooking(person,total_days,tariff,roomType);
		//sb.roomBooking(person,total_days,tariff,roomType);
		//System.out.println("Total Tariff: "+d);
		
	}

}
