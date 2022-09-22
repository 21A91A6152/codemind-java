import java.util.Scanner;
class primepalindrome 
{
	public static boolean isprime(int n) 
	{
		if(n<1)
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
	public static boolean ispalindrome(int n) 
	{
		int r1,r2,flag=0;
		int d=(int)Math.log10(n);
		while(n>0)
		{
			r1=n%10;
			r2=n/(int)(Math.pow(10,d));
			if(r1!=r2)
			{
				flag=1;
				break;
			}
			n=n%(int)(Math.pow(10,d));
			n=n/10;
			d=d-2;
		}
		if(flag==1)
		{
			return false;
		}
		else
		{
			 return true;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int m,n=0,i;
		m=sc.nextInt();
		if(m<10)
		{
		    m=10;
		}
		for(i=m+1;i<=10000000;i++)
		{
			if(isprime(i) && ispalindrome(i))
			{
				n=i;
				break;
			}
		}
		System.out.println(n);
	}
}
