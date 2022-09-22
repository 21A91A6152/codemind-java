import java.util.Scanner;
class Prime
{
    public static void main(String args[])
    {
        int a,i,c=0,d=1;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        while(a>0)
        {
            i=a%10;
            a=a/10;
            c=c+i;
            d=d*i;
        }
        if(c==d)
        {
            System.out.println("Spy Number");
        }
        else
        {
            System.out.println("Not Spy Number");
        }
    }
}