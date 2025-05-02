public class ParaConstructor 
{
    int marks;
    String name;
    ParaConstructor(int a,String b)
    {
      marks=a;
      name=b;
    }

    


public static void main(String[] args) 
{
    ParaConstructor obj1=new ParaConstructor(21,"Syed");
    ParaConstructor obj2=new ParaConstructor(22,"Ali");
    System.out.println(obj1.marks+" "+obj1.name);
    System.out.println(obj2.marks+" "+obj2.name);
   
    
   
}
}
