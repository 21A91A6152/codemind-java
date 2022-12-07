import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,f=0,ind=0,c=0,min=0,max=0,k=0,d=0;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int b[]=new int[n];
        for(i=0;i<n;i++)
        {
            if(arr[i]>k)
            {
                k=arr[i];
            }
            f=0;
            for(j=0;j<i;j++)
            {
                if(arr[i]==arr[j])
                {
                    f=1;
                    break;
                }
            }
            if(f==0)
            {
                b[ind++]=arr[i];
            }
        }
        for(i=0;i<ind;i++)
        {
            c=0;
            for(j=0;j<n;j++)
            {
                if(b[i]==arr[j])
                {
                    c+=1;
                }
            }
            if(b[i]==c)
            {
                d+=1;
                if(b[i]>max)
                {
                    max=b[i];
                }
                if(b[i]<k)
                {
                    k=b[i];
                }
            }
        }
        if(d>0)
        {
            System.out.print(k+" "+max);
        }
        else
        {
            System.out.println("-1");
        }
    }
}