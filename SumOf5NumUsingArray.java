import java.util.Scanner;
public class SumOf5NumUsingArray {
    public static void main (String[] args)
    {
    Scanner Scan = new Scanner(System.in);
    System.out.print("Enter the size of an array :");
    int arraySize = Scan.nextInt();
    int array[]=new int[arraySize];
    int Sum=0;

    for(int i=0;i<arraySize;i++)
    {
        System.out.println("Enter the number of "+i+" index :");
        array[i]=Scan.nextInt();
        Sum=Sum+array[i];
        System.out.println("The sum of the array is : "+Sum);
    }
    Scan.close();
    System.out.println("The sum of the array is : "+Sum);
}
}
