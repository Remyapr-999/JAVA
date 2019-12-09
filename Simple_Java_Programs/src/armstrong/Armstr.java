package armstrong;
import java.io.IOException;
import java.util.Scanner;
public class Armstr {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int num,x,count=0;
		double sum=0;
		double pdt;
		Scanner br = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = br.nextInt();
		int n = num;
		int n1 = num;
		while(num > 0)
		{
			count++;
			num=num/10;
		}
		while(n>0) 
		{		
			x = n%10;
			pdt = Math.pow(x, count);
			sum = sum+pdt;
			n=n/10;
			
			
		}
		if(sum==n1)
		{
			System.out.println("The given number is amstrong");
		}
		else
		{
			System.out.println("The given number is not amstrong");
		}
		br.close();
	}

}
