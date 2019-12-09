package ncr;
import java.util.Scanner;
public class NcrOfNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n,r,ncr,i,nf=1,rf=1,xf=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		n = sc.nextLong();
		System.out.println("Enter the value of r");
		r = sc.nextLong();
		long x = n-r;
		for(i=1;i<=n;i++)
		{
			nf = nf*i;
		}		
		for(i=1;i<=r;i++)
		{
			rf = rf*i;
		}		
		for(i=1;i<=x;i++)
		{
			xf = xf*i;
		}		
		long d = rf*xf;
		ncr=nf/d;
		System.out.println("The NCR factor for given values is "+ncr);
		sc.close();
	}

}
