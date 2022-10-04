import java.util.Scanner;
class digit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0,d=0;
        n=sc.nextInt();
        int x[]=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            d=(int)Math.log10(x[i])+1;
            if(d%2==0)
            {
                c+=1;
            }
            d=0;
        }
        System.out.println(c);
    }
}