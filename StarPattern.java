import java.util.Scanner;
public class StarPattern {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter num of rows:");
		int n=scan.nextInt();
		
		for(int i=1;i<=n;i++)//loop for each row
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");//print spaces
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");//print stars
			}
			System.out.println(); //move to next line
		}
			
          scan.close();
	}

}
