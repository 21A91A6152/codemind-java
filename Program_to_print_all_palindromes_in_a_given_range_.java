import java.util.Scanner;
class compound
{
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
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,i;
        n=sc.nextInt();
        m=sc.nextInt();
        for(i=n;i<=m;i++)
        {
            if(ispalindrome(i))
            {
                System.out.print(i+" ");
            }
        }
    }
}