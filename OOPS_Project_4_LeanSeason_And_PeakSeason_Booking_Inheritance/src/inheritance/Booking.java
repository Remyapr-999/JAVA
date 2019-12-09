package inheritance;

public class Booking {
	int person;
	int total_days;
	double tariff;
	String roomType;
	//int total_days;
	//double tariff;
	double roomBooking(int person,int total_days,double tariff,String roomType)
	{
		double total = person*total_days*tariff;
		return total;
		
		
	}
	public int getPerson() {
		return person;
	}
	public void setPerson(int person) {
		this.person = person;
	}
	public int getTotal_days() {
		return total_days;
	}
	public void setTotal_days(int total_days) {
		this.total_days = total_days;
	}
	public double getTariff() {
		return tariff;
	}
	public void setTariff(double tariff) {
		this.tariff = tariff;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	

}
