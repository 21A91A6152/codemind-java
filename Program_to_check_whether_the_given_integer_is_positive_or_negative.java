import java.util.Scanner;
class hi
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new  Scanner(System.in);
        n=sc.nextInt();
        if(n>0)
        {
            System.out.println("Positive Number");
        }
        else
        {
            System.out.println("Negative Number");
        }
        sc.close();
    }
}