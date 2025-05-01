import java.util.Scanner;
class ifelse2
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();

        if(num%3 ==0 && num%5==0)
        {
            System.out.println("Number is Divisible by three and five");

        }
        else
        {
            System.out.println("Number is not Divisible by three and five");
        }

    }

}