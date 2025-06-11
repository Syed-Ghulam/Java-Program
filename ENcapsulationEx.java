

public class ENcapsulationEx
{
	private String name;//private num var
	
	public String getname() {   // access the data
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		ENcapsulationEx obj=new ENcapsulationEx();
		obj.setname("hai");
		System.out.println(obj.getname());
		
		
		//encapsulation:
//		bind the method and data

	//how encapsulation is implemented :
//		implementing the data or member variable in private access modifier .
	//getter and setter method is used to provide the functionality and implementation of method is written from the user

	//get->fetch or access the data
	//set->modify the data
		
		
		//In encapsulation, the variables or data of a class are hidden from any other class and can be accessed only through any member function of its own class.
		//A private class can hide its members or methods from the end user, using abstraction to hide implementation details, by combining data hiding and abstraction.
		//Encapsulation can be achieved by Declaring all the variables in the class as private and writing public methods in the class to set and get the values of variables.
		//It is more defined with the setter and getter method.
		
		
		

	}

}

