import P.B;
import P1.A;
import P2.C; //  Prime or Not
import java.util.Scanner;
public class test1
{
    public void Display()
    {
        A a = new A();
        B b = new B();
        C c = new C();
        Scanner sc = new Scanner (System.in);
        int ch;
        boolean quit = false ;
        while(!quit)
        {
            System.out.println("Enter Your Choice :");
            System.out.println("1.Fibonacci");
            System.out.println("2.Sum of Digits");
            System.out.println("3.Palindrome");
            System.out.println("4.Factorial");
            System.out.println("5.Prime or Not");
            System.out.println("6.Exit");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1: {
                    System.out.println("Enter the limit for Fibonacci Series :");
                    int n = sc.nextInt();
                    a.fibonacci(n);
                    break;
                }
                case 2:{
                    System.out.println("Enter the Number to Sum its Digits : ");
                    int n = sc.nextInt();
                    a.Sum(n);
                    break;
                }
                case 3:{
                    System.out.println("Enter the String to check Palindrome :");
                    b.Palindrome();
                    break;
                }
                case 4:{
                    System.out.println("Enter the Number to find Factorial :");
                    int n = sc.nextInt();
                    b.Factorial(n);
                    break;
                }
                case 5:{
                    System.out.println("Enter number to check Prime :");
                    int n = sc.nextInt();
                    c.Prime(n);
                    break;
                }
                case 6:{
                    quit = true;
                    break;
                }
            }
        }
    }
}