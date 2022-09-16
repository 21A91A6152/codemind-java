import java.util.Scanner;
class Hello
{
	public static void main(String args[])
	{
		int n,a=0,b=1,c=0,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.print(a+" " );
		System.out.print(b+" " );
        for(i=0;i<n-2;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" " );
        }
		 

		sc.close();
	}
}