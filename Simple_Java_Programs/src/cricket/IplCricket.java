package cricket;
import java.util.Scanner;
public class IplCricket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noOfBowlers,i,count=0;
		float sum=0;
		int runs[],bowler[];
		float eco[];
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number of bowlers");
		noOfBowlers = sc.nextInt();
		runs = new int[noOfBowlers];
		System.out.println("Enter the runs conceded by the bowlers");
		for(i=0;i<noOfBowlers;i++)
		{
			runs[i] = sc.nextInt();
		}
		bowler = new int[noOfBowlers];
		System.out.println("Enter the number of balls for each bowler");
		for(i=0;i<noOfBowlers;i++)
		{
			bowler[i] = sc.nextInt();
		}
		System.out.println("Economy of the bowlers is");
		eco = new float[noOfBowlers];
		for(i=0;i<noOfBowlers;i++)
		{
			bowler[i]=bowler[i]/6;
			float e = (float)runs[i]/bowler[i];
			eco[i] = (float) e;
			System.out.println(e);
			sum=sum+e;
		}
		float avg = sum/noOfBowlers;
		System.out.println("The overall economy of the teanm is "+ avg);
		for(i=0;i<noOfBowlers;i++)
		{
			if(eco[i] < avg)
			{
				count++;
			}
		}
		System.out.println("The number of bowlers eligible are "+ count);
		sc.close();
	}

}
