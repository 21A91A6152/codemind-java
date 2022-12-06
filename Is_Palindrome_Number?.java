import java.util.Scanner;
class java
{
    public static int ispalindrome(int n)
    {
        int i,temp=0,s=0;
        if(n<0)
        {
            n=n*(-1);
        }
        temp=n;
        while(n>0)
        {
            i=n%10;
            s=s*10+i;
            n=n/10;
        }
        if(s==temp)
        {
            return 2;
        }
        else
        {
            return 1;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        System.out.print(ispalindrome(n));
    }
}