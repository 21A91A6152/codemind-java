import java.util.Scanner;
class problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=0,b=0,c=0,d=0;
		String s1=sc.nextLine();
		String upper="AEIOUaeiou";
		String lower="SDFGHJKLZXCVBNMQWRTYPsdfghjklmnbvcxzqwrtyp";
		String digit="1234567890";
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(upper.contains(ch+""))
			{
				a+=1;
			}
			else if(lower.contains(ch+""))
			{
				b+=1;
			}
			else if(digit.contains(ch+""))
			{
				c+=1;
			}
			else
			{
				d+=1;
			}
		}
		System.out.println("Vowels: "+a);
		System.out.println("Consonants: "+b);
		System.out.println("Digits: "+c);
		System.out.println("White spaces: "+d);
	}

}