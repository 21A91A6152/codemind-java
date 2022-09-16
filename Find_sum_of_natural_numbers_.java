import java.util.Scanner;
class prime
{
    public static void main(String args[])
    {
        int a,i,sum=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        for(i=1;i<=a;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}