import java.util.LinkedList;

public class LinkedList_Singly {

	public static void main(String[] args)
	{
		LinkedList<String> cars=new LinkedList<String>();
		cars.add("volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Benz");
		cars.add("Mazda");
		System.out.println(cars);
		
		cars.addFirst("Mazda");
		cars.addLast("audi");
		System.out.println(cars);
		//use removefirst() to remove the first item from the list
		cars.removeFirst();
		System.out.println(cars);
		cars.removeLast();
		System.out.println(cars);
		cars.getFirst();
		System.out.println(cars);
		cars.getLast();
		System.out.println(cars);
		

	}

}
