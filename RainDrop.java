import java.util.Scanner;
class rain
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0;
        n=sc.nextInt();
        if(n%3==0)
        {
            c+=1;
            System.out.print("Pling");
        }
        if(n%5==0)
        {
            c+=1;
            System.out.print("Plang");
        }
        if(n%7==0)
        {
            c+=1;
            System.out.print("Plong");
        }
        if(c==0)
        {
            System.out.println(n);
        }
    }
}