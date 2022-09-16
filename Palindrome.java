import java.util.Scanner;
class Prime
{
    public static void main(String args[])
    {
        int a,i,c=0,d=0;
        Scanner sc=new Scanner(System.in);
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