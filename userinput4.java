import java.util.Scanner;

class userinput4
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String Name=scan.nextLine();
        double score=scan.nextInt();
       
        scan.nextLine();
         String Department=scan.nextLine();
    
        System.out.println("My name is "+Name);
        System.out.println("My score is "+score/10+"/10");
               System.out.print("My Department is "+Department);
    }
}