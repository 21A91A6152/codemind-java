import java.util.Scanner;
class prime
{
    public static boolean isprime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int k=0;k<n;k++)
        {
            int x,i,a=0,b=0;
            x=sc.nextInt();
            if(isprime(x))
            {
                System.out.println(x);
            }
            else
            {
                for(i=x+1;i<100000;i++)
                {
                    if(isprime(i))
                    {
                        a=i;
                        break;
                    }
                }
                for(i=x-1;i>0;i--)
                {
                    if(isprime(i))
                    {
                        b=i;
                        break;
                    }
                }
                if((a-x)>(x-b))
                {
                    System.out.println(b);
                }
                else if((a-x)==(x-b))
                {
                    System.out.println(b);
                }
                else
                {
                    System.out.println(a);
                }
            }
        }
    }
}