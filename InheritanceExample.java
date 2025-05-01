class Animalnew{
	//parent class or super or base class
	// child class or sub class
	String name;
	public void eat()
	{
		System.out.println("I can eat");
	}
}

class Dog extends Animalnew
{
	public void display()
	{
		System.out.println("My name is "+name);
	}
}
class InheritanceExample{
	public static void main(String args[])
	{
		Dog obj=new Dog();
		obj.name="puppy";
		obj.display();
		obj.eat();
	}

}