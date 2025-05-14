public class NullPointer {

	public static void main(String[] args)
	{
		try {
			String a=null,b="Hello";
			System.out.println(a.charAt(0));
			System.out.println(b.charAt( 0));
		}
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer");
		}

	}

}