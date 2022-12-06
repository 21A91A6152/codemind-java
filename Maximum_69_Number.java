import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int i,s=0,d=0,n=0,j;
        while(m>0)
        {
            j=m%10;
            m=m/10;
            n=n*10+j;
        }
        while(n>0)
        {
            i=n%10;
            n=n/10;
            if(d==0 && i==6)
            {
                d+=1;
                i=9;
            }
            s=s*10+i;
        }
        System.out.println(s);
    }
}