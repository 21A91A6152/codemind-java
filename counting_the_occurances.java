import java.util.Scanner;
class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c=0;
        String str=sc.nextLine();
        String s=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(s.contains(ch+""))
            {
                c+=1;
            }
        }
        if(c>0)
            System.out.println(c);
        else
        {
            System.out.println("-1");
        }
    }
}