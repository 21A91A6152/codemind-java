import java.util.Scanner;
class diff
{
    public static int rev(int n)
    {
        int i,revr=0;
        while(n>0)
        {
            i=n%10;
            revr=revr*10+i;
            n=n/10;
        }
        return revr;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,a,j=0,sum=0,temp=0,s=0;
        n=sc.nextInt();
        a=sc.nextInt();
        temp=n;
        for(int k=0;k<a;k++)
        {
            i=n%10;
            sum=sum*10+i;
            n=n/10;
        }
        sum=rev(sum);
        j=rev(temp);
        for(int k=0;k<a;k++)
        {
            i=j%10;
            s=s*10+i;
            j=j/10;
        }
        if(sum>s){
        System.out.println(sum-s);}
        else
        {
            System.out.println(s-sum);
        }
    }
}