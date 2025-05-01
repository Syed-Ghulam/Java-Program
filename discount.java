import java.util.Scanner;
class Discount
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your amount:");
        double amount= scan.nextInt();
        double discount=0;
       
        if(amount<100)
           {
             discount=0;
            System.out.println("No Disount");
           }
           else if(amount >100 || amount<500)
           {
            discount=amount*0.10;
             
            System.out.println("Disount amount"+amount/10);

           }
           else if(amount >500)
           {
            discount= amount*0.20;
           
            System.out.println("Discount amount"+amount/20);
           }
           
           double final_amount=amount-discount;
           System.out.println("Final amount:"+final_amount);


        
        
        

    }

}