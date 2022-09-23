import java.util.Scanner;
class hello 
{
    public static void main(String args[])
    {
        int l,i,r,k,c=0;
        Scanner sc=new Scanner(System.in);
        l=sc.nextInt();
        r=sc.nextInt();
        k=sc.nextInt();
        for(i=l;i<=r;i++)
        {
            if(i%k==0)
            {
                c+=1;
            }
        }
        System.out.println(c);
        
    }
}