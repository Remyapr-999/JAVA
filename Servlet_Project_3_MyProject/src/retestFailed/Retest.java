package retestFailed;
import java.util.Scanner;
public class Retest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,count=0;
		int arr[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students");
		n = sc.nextInt();
		arr = new int[n];
		System.out.println("Enter the marks of students");
		for(i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(arr[i]<50)
			{
				count++;
			}
		}
		System.out.println("Number of students appearing for retest is "+count);
		sc.close();
	}

}
