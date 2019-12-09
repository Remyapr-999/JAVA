package studentHeights;
import java.util.Scanner;
public class Heights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,i,j;
		float array[],temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students");
		number = sc.nextInt();
		System.out.println("Enter the heights of students");
		array = new float[number];
		for(i=0;i<number;i++)
		{
			array[i]=sc.nextFloat();
		}
		System.out.println("The heights in order are");
		for(i=0;i<number;i++)
		{
			for(j=i;j<number;j++)
			{
				if(array[i]>array[j])
				{
	
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		for(i=0;i<number;i++)
		{
			System.out.println(""+array[i]);
		}
		sc.close();
	}

}
