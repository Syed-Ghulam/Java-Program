import java.util.Scanner;

class EvenOrOddPrgUsingConstructor 
    {
        void CheckNumber()
        {
            System.out.println("Even Number");
        }
        EvenOrOddPrgUsingConstructor(int a) 
        {
            if(a %2 ==0)
            {
                this.CheckNumber();            
            }
            else{
                System.out.println("Odd Number");
            }
            
        }


        public static void main(String[] args) 
        {
            Scanner Scan = new Scanner(System.in);
            System.out.println("Enter a number");
            int number = Scan.nextInt();

            EvenOrOddPrgUsingConstructor obj = new EvenOrOddPrgUsingConstructor(number);
        }
    }