import java.util.Scanner;
class hello
{
    public static void main(String args[])
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        
        System.out.println(a*b);
        sc.close();
    }
}