import java.util.Scanner;
class java
{
    public static boolean isprime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        for(int i=2;i<=(int)Math.sqrt(n);i++)
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
        int n,i,j,c=0,max=0,min=0,a=0,b=0;
        n=sc.nextInt();
        int x[]=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(x[i]>max)
            {
                max=x[i];
                a=i;
            }
        }
        min=max;
        for(i=0;i<n;i++)
        {
            if(x[i]<min)
            {
                min=x[i];
                b=i;
            }
        }
        if(a>b)
        {
            for(i=b;i<=a;i++)
            {
               if(isprime(x[i]))
                {
                    c+=1;
                }
            }
            System.out.println(c);
        }
        else
        {
            for(i=a;i<=b;i++)
            {
               if(isprime(x[i]))
                {
                    c+=1;
                }
            }
            System.out.println(c);
        }
 
    }
}