import java.util.Scanner;
public class SearchArray {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int arraySize = Scan.nextInt();
        int array[] = new int [arraySize];
        

        for(int i=0;i<arraySize;i++)
        {
            System.out.print("Enter the number for index " + i + ": ");
            array[i]=Scan.nextInt(); 
        }
        System.out.print("Enter the number to search: ");
        int searchNumber = Scan.nextInt();
        for(int i=0;i<arraySize;i++)
        {
             if(searchNumber==array[i])
           {
            System.out.println("The number " + searchNumber + " is found at index : " + (i+1));
            break;
           } 
       
        }
        }
       

        
    }
      
