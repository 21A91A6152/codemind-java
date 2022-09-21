import java.util.Scanner;
class tables
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,m;
        n=sc.nextInt();
        m=sc.nextInt();
        for(i=1;i<=m;i+=2)
        {
            System.out.println(n+" x "+i+" = "+n*i);   
        }
    }
}