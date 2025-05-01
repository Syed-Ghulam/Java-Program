
import java.util.Scanner;

class elseif4
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        int salary=scan.nextInt();
        int age=scan.nextInt();
        

        if(salary>=20000 || age<=25)
        {
            System.out.println("Eligible for loan");
            System.err.println("enter your loan amt");
            int loan=scan.nextInt();
            if(loan<=50000)
            {
                System.err.println("you are eligible for loan");
            }
            else
            {
                System.err.println("maximum loan amt");
            }
            
        }
        else{
            System.err.println("no loan");
        }
  }
}