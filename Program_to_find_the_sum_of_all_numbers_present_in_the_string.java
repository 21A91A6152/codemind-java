import java.util.Scanner;
class string
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String d="0123456789";
        int s=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(d.contains(ch+""))
            {
                s+=(ch-48);
            }
        }
        System.out.print(s);
    }
}