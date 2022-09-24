import java.util.Scanner;
class ugly
{
   
    static int divideByGreatestDivisible(int number, int gdp)  
    {  
        while (number % gdp == 0)  
            number = number / gdp;  
        return number;  
    }  
    static boolean checkUglyNumber(int number)  
    {  
        number = divideByGreatestDivisible(number, 2);  
        number = divideByGreatestDivisible(number, 3);  
        number = divideByGreatestDivisible(number, 5);  
   
        return (number == 1) ? true : false;  
    }  
    public static void main(String args[])  
    {  
          
        int n;
        Scanner sc = new Scanner(System.in);  
        n = sc.nextInt();  
        if (checkUglyNumber(n))   
                        System.out.println("Ugly Number");   
                else  
                        System.out.println("Not Ugly Number");  
          
    }
}
