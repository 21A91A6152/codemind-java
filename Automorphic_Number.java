import java.util.Scanner;
class java
{
    public static int rev(int n)
    {
        int i,s=0;
        while(n>0)
        {
            i=n%10;
            s=s*10+i;
            n=n/10;
        }
        return s;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,m=0,x=0,k=0,sum=0,j=0,y=0,temp=0;
        int n=sc.nextInt();
        temp=n;
        k=(int)Math.log10(n)+1;
        x=n*n;
        for(i=0;i<k;i++)
        {
            j=x%10;
            sum=sum*10+j;
            x=x/10;
        }
        y=rev(sum);
        if(temp==y){
            System.out.println("Automorphic Number");
        }
        else
        {
            System.out.println("Not an Automorphic Number");
        }
         
        
        
        
    }
}