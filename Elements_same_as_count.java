import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        int n,c=0,d=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] b=new int[n];
        int ind=0;
        for(int i=0;i<n;i++)
        {
            int f=0;
            for(int j=0;j<i;j++)
            {
                if(arr[i]==arr[j]) 
                {
                    f=1;
                    break;
                }
            }
            if(f==0)
            {
               b[ind]=arr[i];
               ind++;
            }
        }
        for(int i=0;i<ind;i++)
        {
            c=0;
            for(int j=0;j<n;j++)
            {
                if(b[i]==arr[j])
                {
                    c+=1;
                }
            }
            if(c==b[i])
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