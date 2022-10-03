import java.util.Scanner;
class lower
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String s="ASDFGHJKLMNBVCXZQWERTYUIOOP";
        String s2="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(s.contains(ch+""))
            {
                s2=s2+(char)(str.charAt(i)+32);
            }
            else
            {
                s2=s2+(char)(str.charAt(i));
            }
        }
        System.out.println(s2);
    }
}