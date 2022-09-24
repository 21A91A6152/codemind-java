import java.util.Scanner;
class factorialnum
{
    public static int factorial(int m)
    {
        int fact=1,i;
        for(i=1;i<=m;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,m;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            m=sc.nextInt();
            System.out.println(factorial(m));
        }
    }
}