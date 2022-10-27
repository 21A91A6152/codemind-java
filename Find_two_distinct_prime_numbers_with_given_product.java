import java.util.Scanner;
class prime
{
    public static boolean isprime(int k)
    {
        int i;
        if(k<1)
        {
            return false;
        }
        for(i=2;i<=(int)Math.sqrt(k);i++)
        {
            if(k%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,sum,c=0,x=0,y=0;
        n=sc.nextInt();
        for(i=2;i<=n;i++)
        {
            if(isprime(i))
            {
                for(j=i+1;j<=n;j++)
                {
                    if(isprime(j))
                    {
                        if(i*j==n)
                        {
                            c+=1;
                            x=i;
                            y=j;
                            break;
                        }
                    }
                }
                if(c>0)
                {
                    break;
                }
            }
        }
        if(c>0)
        {
            if(x<y){
            System.out.println(x+" "+y);}
            else{
                System.out.println(y+" "+x);
            }
        }
        else
        {
            System.out.println("-1");
        }
    }
}