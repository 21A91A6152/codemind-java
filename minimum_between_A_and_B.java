import java.util.Scanner;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x,y,c=0,min=0,i;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        x=sc.nextInt();
        y=sc.nextInt();
        min=y;
        for(i=0;i<n;i++)
        {
            if(arr[i]>=x && arr[i]<=y)
            {
                if(arr[i]<min)
                {
                    min=arr[i];
                }
                c+=1;
            }
        }
        if(c>0)
        {
            System.out.println(min);
        }
        else
        {
            System.out.println("-1");
        }
    }
}