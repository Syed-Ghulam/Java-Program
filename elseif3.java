import java.util.Scanner;
class elseif3

{
    public static void main(String[] args) 
        {
            Scanner scan=new Scanner(System.in);
            String signal=scan.nextLine();

            
                if(signal.equals("red"))
                {
                    System.out.println("Stop");
                }
                else if(signal.equals("yellow"))
                {
                    System.out.println("Get ready");
                }
                else if(signal.equals("green"))
                {
                    System.out.println("Go");
                }



        }
    
}