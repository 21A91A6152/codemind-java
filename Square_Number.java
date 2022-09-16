import java.util.Scanner;
class prime
{
    public static void main(String args[])
    {
        int a,i,j,c=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        for(i=0;i<a/2;i++)
        {
            for(j=i+1;j<=(a/2);j++)
            {
            if((i*i)+(j*j)==a)
            {
              c=1;
              break;
            }
            }
            if(c==1)
            {
                break;
            }
        }
        if(c==1)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
    