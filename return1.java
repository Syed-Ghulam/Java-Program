class return1
{
  int sum(int a,int b)
  {
    int c=a+b;
    return c;
  }
  public static void main(String[] args)
  {
    return1 obj1=new return1();
   int total= obj1.sum(5,9);
   System.out.println(total);
      
  }
}
