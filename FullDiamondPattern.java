import java.util.Scanner;

public class FullDiamondPattern {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter num of rows");
		int row=scan.nextInt();
		
		//upper half including middle row
		for(int i=1;i<=row;i++)
		{
			//print spaces
			for(int j=1;j<=row-i;j++)
			{
				System.out.print(" ");
			}
			//print stars
			for(int k=1;k<=(2*i-1);k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//lower half
		
		for(int i=row-1;i>=1;i--)
		{
			//print spaces
			for(int j=1;j<=row-i;j++)
			{
			System.out.print(" ");
			}
			//print stars
			for(int k=1;k<=(2*i-1); k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
scan.close();


	}

}
