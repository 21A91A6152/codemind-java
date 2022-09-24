import java.util.Scanner;
class reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0,r=0,a=0;
        a=n;
        if(n<0)
        {
            n=n*(-1);
        }
        while(n>0)
        {
            i=n%10;
            n=n/10;
            r=r*10+i;
        }
        if(a<0)
        {
            System.out.println(r*(-1));
        }
        else
        {
            System.out.println(r);
        }
    }
}