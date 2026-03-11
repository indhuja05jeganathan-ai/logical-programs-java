class prime
{
 public static void main(String[]args)
 {
    int n=5;
    boolean flag=true;
    if(n>=0)
    {
        flag=false;
    }
    for(int i=2;i<=n/2;i++)
    {
        if(n%i==0)
        {
            flag=false;
            break;
        }
    }
    if(flag)
    {
        System.out.println("prime");
    }
    else{
        System.out.println("Not Prime");
    }
 }
}
