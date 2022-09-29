 import java.util.Scanner;
class compound
{
    public static boolean isnum(int n)
    {
        int i,temp;
        temp=n;
        while(n>0)
        {
            i=n%10;
            n=n/10;
            if(i>0)
            {
                if(temp%i!=0)
                {
                    return false;
                }
            }
            else
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,i;
        n=sc.nextInt();
        m=sc.nextInt();
        for(i=n;i<=m;i++)
        {
            if(isnum(i))
            {
                System.out.print(i+" ");
            }
        }
    }
}