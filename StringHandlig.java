import java.util.Arrays;

public class StringHandlig {

	public static void main(String[] args) {
		//split
		String vowels="a::b::c::d::e";
		//splitting the string
		//storing the result in an array
		String[] resultvowels=vowels.split("::");
		//converting array to string and printing it
		System.out.println("result"+Arrays.toString(resultvowels));
		
		//replace the text  or char with the given text
		String str34="hai bat and ball";
		System.out.println(str34.replace('b','h' ));
		
		String subStringresult="Welcome to java World";
		System.out.println(subStringresult.substring(4,6));
		
		//4th character to last character
		
		String subStringresult1="Welcome to java world";
		System.out.println(subStringresult1.substring(4));
		
	//trim is used to remove the unwanted space
	String s1="     Learn Programming";
	String s2="LearnProgramming";
	System.out.println(s1.trim());
	System.out.println(s2.charAt(6));

	}

}