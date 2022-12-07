import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,i,j,f=0,ind=0,g=0,indi=0,c=0;
        n=sc.nextInt();
        m=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int b[]=new int[m];
        for(i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
        }
        int x[]=new int[n];
        int y[]=new int[m];
        for(i=0;i<n;i++)
        {
            f=0;
            for(j=0;j<i;j++)
            {
                if(a[i]==a[j])
                {
                    f=1;
                    break;
                }
            }
            if(f==0)
            {
                x[ind++]=a[i];
            }
        }
        for(i=0;i<m;i++)
        {
            g=0;
            for(j=0;j<i;j++)
            {
                if(b[i]==b[j])
                {
                    g=1;
                    break;
                }
            }
            if(g==0)
            {
                y[indi++]=b[i];
            }
        }
        for(i=0;i<ind;i++)
        {
            int d=0;
            for(j=0;j<indi;j++)
            {
                if(x[i]==y[j])
                {
                    d+=1;
                }
            }
            if(d==0)
            {
                c+=1;
            }
        }
        for(i=0;i<indi;i++)
        {
            int d=0;
            for(j=0;j<ind;j++)
            {
                if(y[i]==x[j])
                {
                    d+=1;
                }
            }
            if(d==0)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}