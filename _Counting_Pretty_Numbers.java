import java.util.Scanner;
class Hello
{
    public static void main(String args[])
    {
        int a,b,n,c=0,j,i,k=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(j=0;j<n;j++)
        {
            c=0;
            a=sc.nextInt();
            b=sc.nextInt();
            for(i=a;i<=b;i++)
            {
                 
                while(i>0)
                {
                    k=i%10;
                    if(k==2 || k==3 || k==9)
                    {
                        c+=1;
                    }
                    k=0;
                    break;
                }
                 
            }
            System.out.println(c); 
        }
          
    }
}