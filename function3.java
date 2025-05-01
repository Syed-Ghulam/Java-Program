class function3
{
    int apple_price=20;
    int apple_count=5;

    void total_money()
    {
        System.out.println("Total amount:"+apple_price*apple_count);
    }
    public static void main(String[] args)
    {
        function3 obj1=new function3();
        obj1.total_money();

    }
}