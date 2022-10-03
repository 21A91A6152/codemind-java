import java.util.Scanner;
class Problem5 {
    public static String reverse(String s) 
    {
    int x = s.indexOf(" ");
    if(x == -1)
      return s;
    return reverse(s.substring(x+1))+" "+s.substring(0, x);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String rev = reverse(s1);
	    System.out.println(rev);
		
	}

}