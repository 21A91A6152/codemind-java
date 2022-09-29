import java.util.Scanner;
class temp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int f,i;
        float c;
        f=sc.nextInt();
        c= ((float)(f-32)*5)/9;
        System.out.format("%.2f",c);
    }
}