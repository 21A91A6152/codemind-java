import java.util.Scanner;
class count
{
    public static boolean ispalindrome(int n)
    {
        int i,c=0,a;
        a=n;
        while(n>0)
        {
            i=n%10;
            n=n/10;
            c=c*10+i;
        }
        if(c==a)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n,i,c=0;
        n=sc.nextInt();
        int x[]=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(ispalindrome(x[i]))
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}