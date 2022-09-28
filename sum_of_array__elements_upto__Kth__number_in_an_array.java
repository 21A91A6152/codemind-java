import java.util.Scanner;
class Problem1 {
	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		int x[],n,i,k,s=0,a=0;
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
		    s+=a;
		    if(a==k)
		    {
		        break;
		    }
		
		}
		System.out.println(s);
		sc.close();
				
		
	}

}
