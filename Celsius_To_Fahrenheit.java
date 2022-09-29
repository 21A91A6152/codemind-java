import java.util.Scanner;
class temp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c,i;
        float f;
        c=sc.nextInt();
        f= ((float)(c*9)/5)+32;
        System.out.format("%.2f",f);
    }
}