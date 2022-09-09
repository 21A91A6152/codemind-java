import java.util.Scanner;
class HelloWorld 
{
    public static void main(String args[])
	{
		int a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		
		System.out.format("%.2f",3.14*a*a);

		sc.close();
	}
}