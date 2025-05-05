import java.util.Scanner;

public class ArrayImplementation2 {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n=scan.nextInt();
		int[] arr=new int[n];
		
		System.out.println("Enter"+n+"Elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("The array elements with its index");
		for(int i=0;i<n;i++)
		{
			System.out.println(i+":"+arr[i]);
		}
		scan.close();

	}

}   