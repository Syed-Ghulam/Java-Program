 class A{
        int a = 100;
        void display()
        {
            System.out.println("this is A super Class");
        }
    }
     class B extends A
    {
        int b = 200;
        void display()
        {
            System.out.println("this is B super Class");
        }
    }
    class C extends A
    {
        int c = 300;
        void display()
        {
            System.out.println("this is C sub Class");
        }
    }
    

    public class InheritanceEx {

    public static void main(String[] args) 
    {
        
     C obj1 = new C();
     obj1.display();

        
        
    }

    
    
}
