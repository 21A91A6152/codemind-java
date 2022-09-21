import java.util.Scanner;
class tables
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,m=0;
        n=sc.nextInt();
        while(n>0)
        {
            i=n%10;
            n=n/10;
            m=m*10+i;
        }
        System.out.println(m);
    }
}