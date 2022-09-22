import java.util.Scanner;
class hcf
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0,h=0,i;
        for(i=1;i<=b;i++)
        {
            if(a%i==0 && b%i==0)
            {
                c=1;
                if(c==1)
                {
                    h=i;
                }
            }
        }
        System.out.println((int)(a*b)/h);
    }
}