
import java.util.Scanner;

public class ArrayMaxMin {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Eneter the number of elements");
		int n=scan.nextInt();
		int arr[]=new int[n];
		
		for (int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		int min=arr[0];
		int max=arr[0];
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			else
			{
				max=arr[i];
			}
		
		
		}
		System.out.println("Max value "+max);
		System.out.println("Min value "+min);

	}

}