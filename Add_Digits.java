import java.util.Scanner;
class add
{
    public static int adddigit(int n)
    {
        int i,s=0;
        while(n>0)
        {
            i=n%10;
            n=n/10;
            s=s+i;
        }
        return s;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,j=0;
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            j=adddigit(n);
            if(j<=9)
            {
                System.out.println(j);
                break;
            }
            else
            {
                n=j;
                continue;
            }
        }
    }
}