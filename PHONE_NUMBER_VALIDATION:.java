import java.util.Scanner;
class phone
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String n;
        n=sc.nextLine();
        if(n.length()==10)
        {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}