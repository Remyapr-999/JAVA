package leapyear;
import java.util.Scanner;
public class Leapyr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int yr;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year");
		yr = sc.nextInt();
		if((yr%4 == 0) && ((yr%400 == 0) || (yr%100 != 0)))
		//if(yr%4 == 0)
		{
			System.out.println("It is a leap year");
		}
		else
		{
			System.out.println("It is not a leap year");
		}
		sc.close();
	}

}
