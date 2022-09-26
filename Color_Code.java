 import java.util.Scanner;
class colorname
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    char ch;
    ch=sc.next().charAt(0);
    switch(ch)
    {
    case 'V':
    System.out.println("Violet");
    break;
    case 'I':
    System.out.println("Indigo");
    break;
    case 'B':
    System.out.println("Blue");
    break;
    case 'G':
    System.out.println("Green");
    break;
    case 'Y':
    System.out.println("Yellow");
    break;
    case 'O':
    System.out.println("Orange");
    break;
    case 'R':
    System.out.println("Red");
    break;
    case 'v':
    System.out.println("Violet");
    break;
    case 'i':
    System.out.println("Indigo");
    break;
    case 'b':
    System.out.println("Blue");
    break;
    case 'g':
    System.out.println("Green");
    break;
    case 'y':
    System.out.println("Yellow");
    break;
    case 'o':
    System.out.println("Orange");
    break;
    case 'r':
    System.out.println("Red");
    break;
    default:
    System.out.println("-1");
    break;
    }
}
}