import java.util.Scanner;
class num
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x;
        n=sc.nextInt();
        x=(int)n*(n-1)/2;
        System.out.println(x);
        
    }
}