class palin
{
    public static void main(String[]args)
    {
        int a=6556;
        int o=a,re=0;
        while(a>0)
        {
            int n=a%10;
            re=re*10+n;
            a=a/10;

        }
        if(o==re)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println(" Not palindrome");
        }
    }
}
