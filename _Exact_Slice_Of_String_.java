import java.util.Scanner;
class slice
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            char ch=str.charAt(i);
            System.out.print(ch);
        }
    }
}