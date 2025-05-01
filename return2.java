class return2
{
    String getname()
    {
        String name="Syed";
        return name;
    }
    public static void main(String[] args)
     {
        return2 obj1=new return2();
        String myname=obj1.getname();
        System.out.println(myname);
    }

}