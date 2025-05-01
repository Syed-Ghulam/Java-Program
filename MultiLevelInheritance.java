class one
{
	public void onemethod() {
		System.out.println("One Method");
	}
}

class two extends one
{
	public void twomethod() {
		System.out.println("Two Method");
	}
}

class three extends two
{
	public void threemethod() {
		System.out.println("Three Method");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) 
	{
	   three obj=new three();
	   obj.onemethod();
	   obj.twomethod();
	   obj.threemethod();
	}
}