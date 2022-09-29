import java.util.Scanner;
class compound
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int p,r,t;
        double ci;
        p=sc.nextInt();
        r=sc.nextInt();
        t=sc.nextInt();
        ci=(double)(p*1.0*Math.pow((1+r/100.00),t));
        System.out.format("%.2f",ci);
    }
}