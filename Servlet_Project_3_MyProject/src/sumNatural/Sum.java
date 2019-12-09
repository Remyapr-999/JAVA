package sumNatural;
import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,sum=0,i;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Enter a number ");
		num = sc.nextInt();
		for(i=1;i<=num;i++)
		{
			sum=sum+i;
		}
		
		}while(num<0);
		System.out.println("The sum is "+sum);
		sc.close();
	}

}
