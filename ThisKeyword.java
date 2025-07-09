public class ThisKeyword {
    public static class Sample
    {
        int a =100;
        int b = 200;
        Sample(int a,int b)
         {
          a = this.a;
          b = this.b;
          System.out.println(a+" "+ b);
         }
    }
    public static void main(String [] args)
    {
       Sample s =new Sample(10,20);

       
    }
}
