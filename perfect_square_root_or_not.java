import java.util.Scanner;
class square
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n,i,c=0;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(i*i==n)
            {
                c+=1;
                System.out.println("True");
            }
        }
        if(c==0)
        {
            System.out.println("False");
        }
    }
}