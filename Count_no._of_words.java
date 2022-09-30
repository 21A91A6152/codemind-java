import java.util.Scanner;
class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0;
        String str=sc.nextLine();
        n=str.length();
        for(i=0;i<n;i++)
        {
             char ch=str.charAt(i);
             if(ch==' ')
             {
                 c+=1;
             }
        }
        c+=1;
        System.out.println(c);
    }
}