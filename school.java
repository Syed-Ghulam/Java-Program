import java.util.Scanner;
class school
{
    String passorfail(int score)
    {
        if(score>35)
        {
            return "pass";
        }
        else{
             return "fail";
        }
    }
        

    
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        int mark=scan.nextInt();
        school obj1= new school();
        String result=obj1.passorfail(mark);
        System.out.println(result);
        
    }
}