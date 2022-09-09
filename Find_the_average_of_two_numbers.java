import java.util.Scanner;
class helloworld
{
    public static void main(String args[])
    {
        int a,b;
        float f;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        f=(float)(a+b)/2;
        System.out.format("%.4f",f);
        sc.close();
    }
}