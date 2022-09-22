import java.util.Scanner;
class Prime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int j=1;j<=n;j++)
        {
            int a,i,c=0,d=0;
            a=sc.nextInt();
            d=a;
            while(a>0)
            {
                i=a%10;
                a=a/10;
                c=c*10+i;
            }
            if(c==d)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");   
            }
        }
    }
}