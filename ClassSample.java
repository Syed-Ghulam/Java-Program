import java.util.Scanner;


public class ClassSample
{
    int sum;
    void getInput()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        sum = num1 + num2;
    
    }
    void Display()
    {
        System.out.println("Sum of two numbers is : " + sum);
    }  

      public static void main (String[] args)
    {
       Class_Sum obj1 = new  Class_Sum();
       Class_Sum obj2 = new  Class_Sum();
       obj1.getInput();
       obj1.Display();
       obj2.getInput();
       obj2.Display();
    }
}

