import java.util.Scanner;

public class IO_Exception {

	
	 public static void main(String[] args) {
		 Scanner scan=new Scanner("Hello");
		 System.out.println(""+scan.nextLine());
		 System.out.println("Exception Output"+"  "+scan.ioException());
		 scan.close();
	 }
    }

	