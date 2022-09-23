import java.util.Scanner;
class Pronic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(i*(i+1)==n)
            {
                c+=1;
            }
        }
        if(c>0)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}