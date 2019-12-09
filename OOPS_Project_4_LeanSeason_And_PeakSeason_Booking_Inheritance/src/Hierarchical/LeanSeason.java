package Hierarchical;
import java.util.Scanner;
import java.util.Scanner;

public class LeanSeason extends Booking {
	int month;
	double dis,amt;
	Scanner sc = new Scanner(System.in);
	double roomBooking(int person,int total_days,String roomType,int month,int discount,double tariff)
	{
		
		double val = super.roomBooking(person,total_days,tariff,roomType);	
		
		dis = val*discount/100;
			
		return val-dis;
	}

}
