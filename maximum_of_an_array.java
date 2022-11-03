import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int min=0;
        int n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            min=x[i];
            break;
        }
        for(int i=0;i<n;i++)
        {
             if(x[i]>min)
             {
                 min=x[i];
             }
        }
        System.out.println(min);
    }
}