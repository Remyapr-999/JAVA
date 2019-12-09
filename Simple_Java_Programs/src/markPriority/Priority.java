package markPriority;
import java.util.Scanner;
public class Priority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j,temp;
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
		System.out.println("The priority of marks is");
		for(i=0;i<n;i++)
		{
			for(j=i;j<n;j++)
			{
				if(arr[i]<arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
