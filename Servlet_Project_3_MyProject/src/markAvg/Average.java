package markAvg;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,sum=0;
		int arr[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students");
		n=sc.nextInt();
		arr = new int[n];
		System.out.println("Enter the marks of students");
		for(i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			sum=sum+arr[i];
		}
		int avg = sum/n;
		System.out.println("The average is "+avg);
		sc.close();
	}

}
