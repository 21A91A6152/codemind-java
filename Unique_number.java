import java.util.Scanner;
class unique
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,k=0,d=0,flag=0;
        n=sc.nextInt();
        d=(int)Math.log10(n)+1;
        int arr[]=new int[d];
        for(int i=0;i<d;i++)
        {
            k=n%10;
            n=n/10;
            arr[i]=k;
        }
         for (int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length; j++)
            {
                if (i!=j)
                {
                    if (arr[i]==arr[j])
                    {
                        flag=1;
                        break;
                    }
                }
            }
            if (flag==1)
            {
                break;
            }
        }
        if (flag==1)
        {
            System.out.println("Not Unique Number");
        }
        else
        {
            System.out.println("Unique Number");
        }
 
    }
}