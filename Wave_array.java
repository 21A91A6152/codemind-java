import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        if(arr[0]<arr[1])
        {
            for(i=0;i<n-1;i++)
            {
                if(i%2==0)
                {
                   if(arr[i]<=arr[i+1])
                   {
                       continue;
                   }
                   else
                   {
                       System.out.println("no");
                       c+=1;
                       break;
                   }
                }
                else
                {
                    if(arr[i]>=arr[i+1])
                    {
                        continue;
                    }
                    else
                    {
                        System.out.println("no");
                        c+=1;
                        break;
                    }
                }
            }
        }
        else
        {
            for(i=0;i<n-1;i++)
            {
                if(i%2==0)
                {
                   if(arr[i]>=arr[i+1])
                   {
                       continue;
                   }
                   else
                   {
                       System.out.println("no");
                       c+=1;
                       break;
                   }
                }
                else
                {
                    if(arr[i]<=arr[i+1])
                    {
                        continue;
                    }
                    else
                    {
                        System.out.println("no");
                        c+=1;
                        break;
                    }
                }
            }
        }
        if(c==0)
        {
            System.out.println("yes");
        }
    }
}