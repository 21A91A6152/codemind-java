import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        int n,i,x,s=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=n*n;
        while(x>0)
        {
            i=x%10;
            x=x/10;
            s=s+i;
        }
        if(n==s)
        {
            System.out.println("Neon Number");
        }
        else
        {
            System.out.println("Not Neon Number");
        }
        
    }
}