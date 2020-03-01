import java.io.*;
import java.util.Scanner;

class assignment3_wfh
{
    public static void main(String args[])
    {
        int choice = Integer.parseInt(args[0]);
        switch(choice)
        {
            case 1:
            {
                int a = Integer.parseInt(args[1]);
                int b = Integer.parseInt(args[2]);
                Copy C = new Copy(a, b);
                Copy C1;
                C1=C;
                System.out.println("a is "+C.a+" and b is "+C.b);
                C.multiply();
            }
            break;
            case 2:
            {
                int size = Integer.parseInt(args[1]);
                int temp, sum = 0;
                for (int i = 0; i < size; i++)
                {
                    temp = Integer.parseInt(args[2+i]);
                    sum = sum + temp;
                }
                System.out.println("The Sum of Integers Entered :"+sum);
            }
        }
    }

}
