package gold;
import java.util.Scanner;
public class GoldSculp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the kgs of gold");
		n = sc.nextInt();
		int sum=0;
		while(n>0)
		{
			sum=sum+n;
			n=n/5;
		}
		//int x = n+(n/5);
		System.out.println("Number of Sculptors can be made is "+sum);
		sc.close();

	}

}
