import java.util.Scanner;
class prime
{
    public static boolean isprime(int n)
	{
		if(n<=1)
			return false;
	    for(int i=2;i<=(int)Math.sqrt(n);i++)
	    {
	    	 if(n%i==0)
	    		 return false;
	    }
	    return true;
	}
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,sum,c=0,x=0,y=0;
        n=sc.nextInt();
        if(isprime(n))
        {
            while(n>0)
            {
                c+=1;
                i=n%10;
                n=n/10;
                if(isprime(i))
                {
                    x+=1;
                }
            }
            if(c==x)
            {
                System.out.println("Mega Prime");
            }
            else
            {
                System.out.println("Not Mega Prime");
            }
        }
        else
        {
            System.out.println("Not Mega Prime");
        }
    }
}