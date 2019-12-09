package winningBid;
import java.util.Scanner;
public class BidWin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i,max;
		int arr[];
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the number of applications");
		num = sc.nextInt();
		arr = new int[num];
		System.out.println("Enter the amount(in crores) ");
		for(i=0;i<num;i++)
		{
			arr[i] = sc.nextInt();
		}
		max=arr[0];
		for(i=0;i<num;i++)
		{
			//for(j=i;j<num;j++)
			//{
				if(arr[i]>max)
				{
					max = arr[i];
				}
				
			//}
		}
		System.out.println("The winning bid is "+max+" crores ");
		sc.close();
	}

}
