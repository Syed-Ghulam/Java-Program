import java.util.Scanner;

public class elseif2
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int m1=scan.nextInt();
        int m2=scan.nextInt();
        int m3=scan.nextInt();
        int m4=scan.nextInt();
        int m5=scan.nextInt();
        int add=m1+m2+m3+m4+m5;
        int avg=add/5;
        System.out.println("your avg score is:"+avg);
        

        if(avg<35)
        {
            System.out.println("Additional class is required");
        }
        else{
            System.out.println("you are good to go");
        }
          

          
          

          



    }
}
