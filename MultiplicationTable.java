import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num=scan.nextInt();
        System.out.println("Multiplication table of "+num);

        for(int i=1;i<=20;i++)
        {
           System.out.println(num+" * "+i+" = : " +num*i); 
        }
    }
}
