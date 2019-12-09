package vehicle;
import java.util.Scanner;
public class VehicleFare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,heavy=0,light=0;
		int arr[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of vehicles");
		n = sc.nextInt();
		arr = new int[n];
		System.out.println("Enter the fare collected for each vehicles");
		for(i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(arr[i]>50)
			{
				heavy++;
			}
			if((arr[i]>0)&&(arr[i]<50))
			{
				light++;
			}
		}
		System.out.println("Number of heavy vehicles "+heavy+" and the number of light weight vehicles is "+light);
		sc.close();
	}

}
