import java.util.Scanner;

class Fibanocci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,a=0,b=1,c=0,i=0,s=0;
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.print(a+" ");
			if(a%2==0)
			{
				s+=a;
			}
			c=a+b;
			a=b;
			b=c;	 
		}
	}

}
