interface FirstInterface{
	public void mymethod();
}
interface SecondInterface{
	public void myOtherMethod();
}

class DemoClass implements FirstInterface,SecondInterface
   {
	public void mymethod() {
		System.out.println("some text...");
	}
	public void myOtherMethod()
	{
		System.out.println("Some other text...");
	}
}
public class MultipleInterface{
	public static void main(String[] args) 
	{
		DemoClass obj=new DemoClass();
		obj.mymethod();
		obj.myOtherMethod();
		
		
	}
}
