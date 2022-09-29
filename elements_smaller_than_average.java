import java.util.Scanner;
class element
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,s=0,avg=0,c=0;
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
            if(x[i]<=avg)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}