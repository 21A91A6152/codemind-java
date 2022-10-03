import java.util.Scanner;
class virat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int m=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if((int)ch>=m)
            {
                m=(int)ch;
            }
            
        }
        System.out.println((char)m);
    }
}