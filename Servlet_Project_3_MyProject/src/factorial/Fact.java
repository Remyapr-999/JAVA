package factorial;
import java.util.Scanner;
public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,f=1,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number alphabets in your name");
		n = sc.nextInt();
		for(i=1;i<=n;i++)
		{
			f = f*i;
		}
		System.out.println("The number of combination is "+f);
		sc.close();

	}

}
