import java.util.Scanner;
class virat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int c=0;
        String digits="0123456789";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(digits.contains(ch+""))
            {
                c+=1;
            }
        }
        if(c>0)
            System.out.println("Contains "+c+" digit");
        else
            System.out.println("Doesn't contain digit");
        
    }
}