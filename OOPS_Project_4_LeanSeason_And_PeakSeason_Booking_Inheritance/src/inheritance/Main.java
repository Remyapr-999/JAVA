package inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int person;
		int total_days;
		double tariff;
		String roomType;
		SeasonBooking sb = new SeasonBooking();
		System.out.println("Booking");
		System.out.println("Enter number of persons : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		person = Integer.parseInt(br.readLine());
		sb.setPerson(person);
		System.out.println("Enter the number of days : ");
		total_days = Integer.parseInt(br.readLine());
		sb.setTotal_days(total_days);
		System.out.println("Enter the room type : ");
		roomType = br.readLine();
		sb.setRoomType(roomType);
		System.out.println("Enter the tariff for single person : ");
		tariff = Double.parseDouble(br.readLine());
		sb.setTariff(tariff);
		double d = sb.roomBooking(person,total_days,tariff,roomType);
		//sb.roomBooking(person,total_days,tariff,roomType);
		System.out.println("Total Tariff: "+d);
		
	}

}
