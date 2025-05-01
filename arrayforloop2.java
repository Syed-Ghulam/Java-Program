import java.util.Scanner;
class arrayforloop2

{
    public static void main(String[] args)
    {
       Scanner scan=new Scanner(System.in);
       System.err.println("Table=");
       int table= scan.nextInt();

        int[] num=new int[10];

        for(int i=1;i<=10;i++)
        {
            System.out.println(i*table);
        }
       
    }
}