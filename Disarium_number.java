 import java.util.Scanner;

class Disarium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,a=0,b=0,i=1,c=0,s=0;
		n=sc.nextInt();
		a=n;
		int d=(int)Math.log10(n);
	    while(n>0)
	    {
	        c=n/(int)(Math.pow(10,d));
	        n=n%(int)(Math.pow(10,d));
	        s=s+(int)(Math.pow(c,i));
	        d=d-1;
	        i=i+1;
	    }
	    if(s==a)
	    {
	        System.out.println("True");
	    }
	    else
	    {
	        System.out.println("False");
	    }
		 
	}

}

