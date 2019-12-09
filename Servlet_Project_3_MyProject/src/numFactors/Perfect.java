package numFactors;
import java.util.Scanner;
public class Perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n = sc.nextInt();
		int num=n;
		System.out.print("The divisors of the number are ");
		for(i=1;i<n;i++)
		{
			if(n%i == 0)
			{
				System.out.print(" "+i);
				sum=sum+i;
			}
		}
		System.out.println("\nThe sum of the divisors are "+sum);
		if(sum==num)
		{
			System.out.println("It is a perfect number");
		}
		else
		{
			System.out.println("It is not a perfect number");
		}
		sc.close();
	}

}
