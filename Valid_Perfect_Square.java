import java.util.Scanner;
class primepalindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            int c=0;
            int a=sc.nextInt();
            for(int j=1;j<=(int)a/2;j++)
            {
                if(a==j*j)
                {
                    c+=1;
                    break;
                }
            }
            if(c==1)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
            
        }
	}
}