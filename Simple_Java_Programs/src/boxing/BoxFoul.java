package boxing;
import java.util.Scanner;
public class BoxFoul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i,min,pos = 0;
		int arr[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of players ");
		num = sc.nextInt();
		arr = new int[num];
		System.out.println("Enter the number of fouls made by each player ");
		for(i=0;i<num;i++)
		{
			arr[i] = sc.nextInt();
		}
		
			min=arr[0];
			for(i=0;i<num;i++)
			{
				//for(j=i;j<num;j++)
				//{
					if(arr[i]<min)
					{
						min = arr[i];
						//pos = i;
						
					}
					
				//}
			}
			for(i=0;i<num;i++)
			{
				if(arr[i]==min)
				{
					 pos=i+1;
					 break;
				}
			}
			//System.out.println(min);
	
		System.out.println("The eligible player is player no:"+ pos +" ("+ min +") fouls");
		sc.close();	

	}

}
