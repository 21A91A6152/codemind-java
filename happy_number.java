import java.util.Scanner;
class happy
{
    public static int ishappy(int n)
    {
        int i,sum=0;
        while(n>0)
        {
            i=n%10;
            sum=sum+i*i;
            n=n/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0;
        n=sc.nextInt();
        while(n>0)
        {
          
            if(n==1 || n==7)
            {
                c+=1;
                System.out.println("True");
                break;
            }
            if(n<=9)
            {
                break;
            }
            else
            {
                n=ishappy(n);
            }
             
        }
        if(c==0)
        {
            System.out.println("False");
        }
    }
}