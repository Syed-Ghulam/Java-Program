public class fparameter
{
    void sub(int m1,int m2)
    {
        System.out.println("Total amt:"+(m1/m2));
    }
    public static void main(String[] args )
    {
        fparameter obj1=new fparameter();
        obj1.sub(60,30);
        
    }
}