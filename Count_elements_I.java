import java.util.Scanner;
class common
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,i,j,c=0,k=0;
        n=sc.nextInt();
        m=sc.nextInt();
        int x[]=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        int y[]=new int[m];
        for(j=0;j<m;j++)
        {
            y[j]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            c=0;
            for(j=0;j<m;j++)
            {
                if(x[i]==y[j])
                {
                    c=1;
                    y[j]=-1;
                }
            }
            if(c==1)
            {
                k++;
            }
        }
        System.out.println(k);
    }
}