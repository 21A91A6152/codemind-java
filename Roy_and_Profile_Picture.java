import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,l,k;
        l=sc.nextInt();
        n=sc.nextInt();
        for(k=0;k<n;k++)
        {
            int x,y;
            x=sc.nextInt();
            y=sc.nextInt();
            if(x<l || y<l)
            {
                System.out.println("UPLOAD ANOTHER");
            }
            else if(x==y)
            {
                System.out.println("ACCEPTED");
            }
            else
            {
                System.out.println("CROP IT");
            }
        }
    }
}