
import java.util.Scanner;


class arrayforloop3

{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("array size:");
        int size=scan.nextInt();
    
        int[] num=new int[size];

        for(int i=0;i<=size-1;i++)
        {
            num[i]= scan.nextInt();
        }



        
    }
}