import java.util.Scanner;
class array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0,s=0,avg=0;
        n=sc.nextInt();
        int x[]=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            s+=x[i];
        }
        avg=s/n;
        for(i=0;i<n;i++)
        {
            if(x[i]==avg)
            {
                c+=1;
            }
        }
        if(c>0){
        System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}