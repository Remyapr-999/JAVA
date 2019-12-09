package fibinacci;
import java.util.Scanner;
public class Fibinacc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,a=0,b=1,i,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n = sc.nextInt();
		System.out.print("The fibonacci series is "+a+" "+b);
		for(i=0;i<=n;i++)
		{
			sum=a+b;
			a=b;
			b=sum;
			System.out.print(" "+sum);
		}
		sc.close();
		
	}

}
