import java.util.Scanner;
class string
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n;
        n=str.length();
        for(int i=n-1;i>-1;i--)
        {
            char ch=str.charAt(i);
            System.out.print(ch);
        }
    }
}