import java.util.Scanner;
class prime
{
    public static boolean isprime(int p)
    {
        if(p<2)
        {
            return false;
        }
        for(int i=2;i<=(int)Math.sqrt(p);i++)
        {
            if(p%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,n,i,j,k;
        n=sc.nextInt();
        for(k=0;k<n;k++)
        {
            a=sc.nextInt();
            int c=0;
            for(i=2;i<a;i++)
            {
                if(isprime(i))
                {
                    for(j=i+1;j<a;j++)
                    {
                        if(isprime(j))
                        {
                            if(i!=j)
                            {
                                if(i*j==a)
                                {
                                    c+=1;
                                }
                            }
                        }
                    }
                }
            }
            if(c>0)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}