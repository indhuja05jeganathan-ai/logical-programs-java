class reverse
{
    public static void main(String[]arsg)
    {
        int a=324,r=0,n=0;
        while(a>0)
        {
            n=a%10;
            r=r*10+n;
            a=a/10;
        }
        System.out.println(r);
    }
}
