import java.io.*;
import java.util.Scanner;

class test2
{
    public static void main(String arzs[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age :");
        int age = sc.nextInt();
        exceptionDemo D = new exceptionDemo(age);
        D.test();
    }
}

class UnderAge extends RuntimeException{
    public UnderAge(int age) {
        super("Under Age\nAge = "+age);
    }
}

class exceptionDemo
{
    int age;
    exceptionDemo(int a)
    {
        if( a <= 0 )
            throw new IllegalArgumentException();
        else
            age = a;
    }
    public void test()
    {
        if (age<18)
            throw new UnderAge(age);
        else
            System.out.println("Not Under Age");
    }
}