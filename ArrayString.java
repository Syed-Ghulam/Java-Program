 public class ArrayString {

	public static void main(String[] args) {
		String courses[]= {"JFS","DS","PFS","DA"};
		//Access through the index value
		System.out.println(courses[2]);
		//length of an array
		System.out.println("The length of an array :"+courses.length);
		
		
		int a[]= {1,2,3,4,5};
		//size of an array
		int n=a.length;
		//traversing array
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+"");
		}

	
    }
}

