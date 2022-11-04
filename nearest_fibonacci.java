import java.util.Scanner;
class nearestfib 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a=0,b=1,c=0,x=0,y=0;
        n=sc.nextInt();
        for(int i=0;i<1000;i++)
        {
        	if(b==n)
            {
                System.out.println(a);
                break;
            }
            if(b>n)
            {
                x=b;
                y=a;
                break;
            }
            c=a+b;
            a=b;
            b=c;
             
        }
        if((n-y)>(x-n))
        {
        	System.out.println(x);
        }
        else if((n-y)==(x-n))
        {
            System.out.println(y+" "+x);
        }
        else
        {
        	System.out.println(y);
        }
    }
}