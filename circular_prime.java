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
    public static int isrev(int n)
    {
        int i,j=0,r=0;
        while(n>0)
        {
            i=n%10;
            r=r*10+i;
            n=n/10;
        }
        return r;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,x=0;
        n=sc.nextInt();
        x=isrev(n);
        if(isprime(n) && isprime(x))
        {
            System.out.println("circular prime");
        }
        else if(isprime(n))
        {
            System.out.println("prime but not a circular prime");
        }
        else
        {
            System.out.println("not prime");
        }
    }
}