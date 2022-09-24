import java.util.Scanner;
class Adamnumber {
    public static int reverse(int n)
    {
        int i,c=0;
        while(n>0)
        {
            i=n%10;
            n=n/10;
            c=c*10+i;
        }
        return c;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m=0,i,x=0,y=0,z=0;
        n=sc.nextInt();
        m=n*n;
        x=reverse(n);
        y=x*x;
        z=reverse(y);
        if(m==z)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}