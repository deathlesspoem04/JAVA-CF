import java.io.*;
import java.util.Scanner;
import java.lang.String;

class assignment2
{
    public static void main(String args[])
    {
        boolean quit = false ;
        while(!quit) {
            System.out.println("Enter 1 for : Finding the Area of a shape ");
            System.out.println("Enter 2 for : Checking Palindrone of a string ");
            System.out.println("Enter 3 for : Sum of Digits ");
            System.out.println("Enter 4 for : Comparing the Strings");
            System.out.println("Enter 5 for : Computing distance in Feet and inches");
            System.out.println("Enter 6 for : Quit");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Enter your input :");
                    double r = sc.nextDouble();
                    System.out.println("Do you want to enter another input ? (0-No/1-Yes): ");
                    int ch = sc.nextInt();
                    switch (ch) {
                        case 0: {
                            if ((int) r == r) {
                                area((int) r);
                            } else {
                                area(r);
                            }
                        }
                        break;
                        case 1: {
                            System.out.println("Enter the Second input :");
                            int l = sc.nextInt();
                            area(r, l);
                        }
                        break;
                    }
                }
                break;
                case 2: {

                    Demo P = new Demo();
                    P = P.compareP();
                    if (P.palindrone == 1) {
                        System.out.println("The string is Palindrome.");
                    } else {
                        System.out.println("The string is not Palindrome.");
                    }
                }
                break;
                case 3: {
                    Demo s1 = new Demo();
                    System.out.println("Enter the number whose sum of digits you want: ");
                    s1.d = sc.nextInt();
                    int sum = s1.sum();
                    System.out.println("Sum of the digits Entered : " + sum);
                }
                break;
                case 4: {
                    System.out.println("Enter 1st string to comapre: ");
                    String[] str = new String[2];
                    str[0] = sc.next();
                    System.out.println("Enter 2nd string to comapre: ");
                    str[1] = sc.next();
                    Demo S = new Demo(str[0], str[1]);
                    if (S.check != 0) {
                        System.out.println("Strings Not Same");
                    } else {
                        System.out.println("Strings Same");
                    }
                }
                break;
                case 5: {
                    Demo I = new Demo();
                    System.out.println("Enter the distance in inches :");
                    int inch = sc.nextInt();
                    I.inches = inch;
                    I.distance();
                    Demo Ir = new Demo();
                    Ir = I;
                    System.out.println("The Distance is : " + Ir.feet + " feet and " + Ir.inches + " inches.");
                }
                break;
                case 6 : quit = true;
                break;
            }
        }

    }
    public static void area(double rad)
    {
        double area = 3.14*rad*rad;
        System.out.println("The Area of the circle is : "+area+" sq. units");
    }
    public static void area(int side)
    {
        int area = side*side;
        System.out.println("The Area of the Square is : "+area+" sq. units");
    }
    public static void area(double l , int b)
    {
        double area = l*b;
        System.out.println("The Area of the Rectangle is : "+(int)area+" sq. units");
    }
}

class Demo
{
    int d, palindrone,check;
    int feet,inches;
    int sum = 0;
    int sum()
    {

        int temp, sum=0;
        while(d!=0)
        {
            sum = sum + d%10;
            d = d / 10;
        }
        this.sum = sum;
        return this.sum;
    }
    public Demo compareP()
    {
        Demo x = new Demo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string :");
        String s1 = sc.nextLine();
        String s2 = "";
    int n = s1.length();
    for(int i = n - 1; i >= 0; i--)
        {
            s2 = s2 + s1.charAt(i);
        }
    if(s1.equalsIgnoreCase(s2))
        {
            x.palindrone = 1;
            return x;
        }
    else
        {
            x.palindrone = 0;
            return x;
        }
    }

    Demo()
    {
        //Default Constructor
    }

    Demo (String a , String b)
    {
        if(a.length()!=b.length())
            this.check = 1;
        else
            for(int c= 0; c<a.length(); c++)
                if(a.charAt(c)!=b.charAt(c))
                    check = 1;

    }

    public void distance()
    {
        feet = inches/12;
        inches = inches-feet*12;
    }
}
