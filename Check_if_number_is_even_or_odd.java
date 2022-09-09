import java.util.Scanner;
class number
{
    public static void main(String ags[])
    {
        int a;
        Scanner sc=new Scanner(System.in);
        
        a=sc.nextInt();
        if(a%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}