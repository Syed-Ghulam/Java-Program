import java.util.Scanner;
class find
{
    void evenorodd(int num)
    {
        if(num%2==0)
        {
            System.out.println("number is even");
        }
        else
        {
            System.err.println("number is odd");
        }

    }
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        find obj1=new find();
        obj1.evenorodd(number);
        
    }
}