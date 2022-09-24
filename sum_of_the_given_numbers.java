import java.util.Scanner;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(a+b);
        }
    }
}