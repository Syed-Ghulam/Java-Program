import java.util.Scanner;

class userinput2
{
    public static void main(String[] args)
    {
        Scanner Syed=new Scanner(System.in);
        String name=Syed.nextLine();
        int age=Syed.nextInt();
        String address=Syed.nextLine();
        System.out.println("My name is "+name);
        System.out.println("My age is "+age);
        System.out.print("My address is "+address); }
}