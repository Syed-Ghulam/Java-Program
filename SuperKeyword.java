class A
{
   int a =10;
   void hello()
   {
    System.out.println("Hello from A");
   }
   void display()
   {
    System.out.println(a);
   }
}
class B extends A
{
    int a = 20;
    void hello()
    {
        super.a = 100;
        super.hello();
        System.out.println("Hello from B");
    }
    void display()
    {
        super.a = 200;;
        super.display();
        System.out.println(a);
    }
}

class SuperKeyword
{
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.hello(); 
        obj1.display();
    }
}