import java.util.Scanner;
class Fibanocci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,a=0,b=1,c=0,i,s=0;
		int x[]= new int[100];
		n=sc.nextInt();
		for(i=0;i<100;i++)
		{
		    x[i]=a;
			c=a+b;
			a=b;
			b=c;	 
		}
		for(i=0;i<100;i++)
		{
		   if(x[i]==n)
		   {
		       s+=1;
		       break;
		   }
		}
		if(s>0)
		{
		    System.out.println("True");
		}
		else
		{
		    System.out.println("False");
		}
	}
}