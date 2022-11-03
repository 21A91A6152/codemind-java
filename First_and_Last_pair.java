import java.util.Scanner;
class jav
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        int j=0;
        if(n%2==0)
        {
            for(int i=0;i<(int)n/2;i++)
            {
                System.out.print(x[j]+" "+x[n-1-j]+" ");
                j+=1;
            }
        }
        else
        {
            for(int i=0;i<(int)n/2;i++)
            {
                System.out.print(x[j]+" "+x[n-1-j]+" ");
                j+=1;
            }
            System.out.println(x[n-j-1]+" "+"0");
        }
    }
}