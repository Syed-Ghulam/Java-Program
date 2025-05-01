import java.util.Scanner;

class userinput
{
    public static void main(String[] args)
    {
        Scanner Syed=new Scanner(System.in);
        String name=Syed.nextLine();
        int age=Syed.nextInt();
        System.out.println("My name is "+name);
        System.out.print("My age is "+age);
    }
}