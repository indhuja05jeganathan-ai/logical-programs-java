class sod
{
    public static void main(String[] args)
    {
        int t = 35790, n = 0, sum = 0;

        while(t > 0)
        {
            n = t % 10;
            sum = sum + n;
            t = t / 10;
        }

        System.out.println("Sum is " + sum);
    }
}
