import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,s=0;
        n=sc.nextInt();
        int x[]=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        if(n%2==0)
        {
            for(i=0;i<n;i++)
            {
                System.out.print(x[i]+" ");
            }
        }
        else
        {
            for(i=0;i<n;i++)
            {
                System.out.print(x[i]+" ");
            }
            System.out.println(0);
        }
    }
}