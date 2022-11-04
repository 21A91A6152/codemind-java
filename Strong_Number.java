import java.util.Scanner;
class strong
{
    public static int fact(int n)
    {
        int i,f=1;
        for(i=n;i>=1;i--)
        {
            f=f*i;
        }
        return f;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0,s=0,temp=0;
        n=sc.nextInt();
        temp=n;
        while(n>0)
        {
            i=n%10;
            n=n/10;
            s=fact(i);
            c+=s;
        }
        if(c==temp)
        {
            System.out.println("The number "+temp+" is a strong number");
        }
        else
        {
            System.out.println("The number "+temp+" is not a strong number");
        }
    }
}