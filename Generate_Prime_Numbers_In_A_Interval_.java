 import java.util.Scanner;
class primepalindrome 
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
	 
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int m,n,i;
		m=sc.nextInt();
		n=sc.nextInt();
		for(i=m;i<=n;i++)
		{
		    if(isprime(i))
		    {
		        System.out.println(i);
		    }
		}
	}
}