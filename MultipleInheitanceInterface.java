interface one1
{
	public void printone();
}
interface Two1
{
	public void printtwo();
}
interface Three1 extends one1,Two1
{
	public void  printthree();
}

class Child implements Three1
{
	public void printone() {
		System.out.println("print one from class one");
		}
	public void printtwo() {
		System.out.println("print two from class one");
		}
	public void printthree() {
		System.out.println("print three from class one");
		}
	}
public class MultipleInheitanceInterface
{
   public static void main(String args[]) {
	   Child c=new Child();
	   c.printone();
	   c.printtwo();
	   c.printthree();
   }
}
