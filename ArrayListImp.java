import java.util.ArrayList;
import java.util.Collections;

public class ArrayListImp {

	public static void main(String[] args)
	{
		ArrayList<Integer> a=new ArrayList<>();
		
		a.add(100);
		a.add(200);
		a.add(400);
		a.add(500);
		a.add(0,1000);
		
		System.out.println(a);
		ArrayList<Object> mix=new ArrayList<>();
		mix.add(100);
		mix.add("String");
		mix.add(0.9);
		mix.add(100000000);
		int num=(int) mix.get(0); //typecasting
		String str1=(String) mix.get(1);//typecasting
		System.out.println(mix);
		
		
		ArrayList <Integer> lista=new ArrayList<Integer>();
		lista.add(100);
		lista.add(200);
		lista.add(400);
		lista.add(500);
		System.out.println(lista);
		//Shuffle the list
		System.out.println("List before Shuffle"+lista);
		Collections.shuffle( lista);
		System.out.println("List After Shuffle"+lista);
		//reverse
		
		System.out.println("List before reverse"+lista);
		Collections.reverse( lista);
		System.out.println("List after reverse"+lista);
		
		//swap
		System.out.println("List before swap"+lista);
		Collections.swap( lista,0,2);
		System.out.println("List after swap"+lista);
		//sort
		System.out.println("List before sorting"+lista);
		Collections.sort( lista);
	    System.out.println("list after sorting"+lista);
    }
}

	    
