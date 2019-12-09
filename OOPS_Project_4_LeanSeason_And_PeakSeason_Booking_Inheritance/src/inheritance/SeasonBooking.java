package inheritance;

public class SeasonBooking extends Booking
{
	
	double roomBooking(int person,int total_days,double tariff,String roomType)
	{
	
		return super.roomBooking(person, total_days, tariff, roomType);	
		
	}

}
