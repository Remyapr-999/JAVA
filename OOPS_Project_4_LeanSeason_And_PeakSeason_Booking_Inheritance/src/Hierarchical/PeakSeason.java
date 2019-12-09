package Hierarchical;
import java.util.Scanner;
public class PeakSeason extends Booking {
	int month;
	double val;
	Scanner sc = new Scanner(System.in);
	double roomBooking(int person,int total_days,String roomType,int month,int peakCharges)
	{
		
		 double val = super.roomBooking(person, total_days, tariff, roomType);	
		double peakVal = val*peakCharges;
		return peakVal;
		//return 0;
	}

}
