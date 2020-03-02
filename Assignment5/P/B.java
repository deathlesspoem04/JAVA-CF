package P;

import java.util.Scanner;

public class B   // Palindrome, Factorial
{
    public void Palindrome ()
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1= "";
        int n = s.length();
        for(int i = n - 1; i >= 0; i--)
        {
            s1 = s1 + s.charAt(i);
        }
        if(s.equalsIgnoreCase(s1))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }

    public void Factorial(int n)
    {
        int i,fact=1;
        for(i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+n+" is: "+fact);
    }

}