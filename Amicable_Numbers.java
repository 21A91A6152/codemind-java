import java.util.Scanner;
class amicable
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,a=0,b=0,i,j;
        n=sc.nextInt();
        m=sc.nextInt();
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                a=a+i;
            }
        }
        for(j=1;j<m;j++)
        {
            if(m%j==0)
            {
                b=b+j;
            }
        }
        if(b==n && a==m)
        {
            System.out.println("Amicable");
        }
        else
        {
            System.out.println("Not Amicable");
        }
    }
}