import java.util.Scanner;
class num
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s=0;
        String str=sc.nextLine();
        String digit="0123456789";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(digit.contains(String.valueOf(ch)))
            {
                s+=(ch-48);
            }
        }
        System.out.println(s);
    }
}