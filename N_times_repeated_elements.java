import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,k,c=0,d=0,f=0,ind=0;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        k=sc.nextInt();
        int b[]=new int[n];
        for(i=0;i<n;i++)
        {
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
            if(c==k)
            {
                d+=1;
                System.out.print(b[i]+" ");
            }
            
        }
        if(d==0)
        {
            System.out.println("-1");
        }
         
    }
}