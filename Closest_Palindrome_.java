import java.util.Scanner;
class java
{
    public static boolean palindrome(int n)
    {
        int i,temp=0,s=0;
        temp=n;
        while(n>0)
        {
            i=n%10;
            n=n/10;
            s=s*10+i;
        }
        if(temp==s)
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
        Scanner sc=new Scanner(System.in);
        int n,i,x=0,y=0;
        n=sc.nextInt();
        for(i=n+1;i<=1000000;i++)
        {
            if(palindrome(i))
            {
                y=i;
                break;
            }
        }
        for(i=n-1;i>=0;i--)
        {
            if(palindrome(i))
            {
                x=i;
                break;
            }
        }
        if((y-n)>(n-x))
        {
            System.out.println(x);
        }
        else if((y-n)==(n-x))
        {
            System.out.println(x+" "+y);
        }
        else
        {
            System.out.println(y);
        }
    }
}