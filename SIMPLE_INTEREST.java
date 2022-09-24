import java.util.Scanner;
class simple
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int p,t,r,s;
        p=sc.nextInt();
        t=sc.nextInt();
        r=sc.nextInt();
        s=(int)(p*t*r)/100;
        System.out.println(s);
    }
}