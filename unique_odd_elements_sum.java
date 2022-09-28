import java.util.Scanner;
class Problem1 {
	public static void uniqueelement(int arr[])
	{
		int i,j,s=0;
		for(i=0;i<arr.length-1;i++)
		{
			if(i==-999)
			{
				continue;
			}
			for(j=i+1;j<arr.length;j++)
			{
				
				if(j!=-999) 
				{
					if(arr[i]==arr[j])
					{
						arr[j]=-999;
						
					}
				}			 
			}
	 
		}
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]!=-999 && arr[i]%2==1)
			{
				s+=arr[i];
			}
		}
		System.out.println(s);
 
	}
	

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		int x[],n,i;
		n=sc.nextInt();
		x=new int[n];
		for(i=0;i<n;i++)
		{
			x[i]=sc.nextInt();
		}
		uniqueelement(x);
		sc.close();
				
		
	}

}
