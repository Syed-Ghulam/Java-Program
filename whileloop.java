import java.util.Random;
class whileloop

{
    public static void main (String[] args)
    {
        Random rand=new Random();
        
        int num=0;
        while(num!=6)
        {
             num=rand.nextInt(10);
            System.out.println(num);
            
        }
    }
}