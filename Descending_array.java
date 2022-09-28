import java.util.Scanner;
class num
{
    public static void main(String args[])
    {
        int n,i,j,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            if(x[i]<x[i+1])
            {
                c+=1;
            }
        }
        if(c>0)
        {
            System.out.println("no");
        }
        else
        {
            System.out.println("yes");
        }
    }
}