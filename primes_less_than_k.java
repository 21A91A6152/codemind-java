import java.util.Scanner;
class prime
{
	public static boolean isprime(int n) {
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
        int n,x[],i,c=0,s=0,a=0,k;
        float avg;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a=x[i];
            if(isprime(a))
            {
                 if(a<=k)
                 {
                     c+=1;
                 }
            }
            a=0;
        }
        System.out.println(c);
    }
}