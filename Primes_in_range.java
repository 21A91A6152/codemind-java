import java.util.Scanner;
class Prime
{
    public static void main(String args[])
    {
        int a,b,i,j,c=0,d=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        if(a==1)
        {
            a=2;
        }
        for(i=a;i<=b;i++)
        {
            d+=1;
            for(j=2;j<Math.sqrt(i)+1;j++)
            {
                if(i%j==0 && i!=2)
                {
                    c+=1;
                    break;
                }
            }
        }
        System.out.println(d-c);
    }
}