package work;
import java.io.*;
import java.util.Scanner;

class Test
{
    public static void main(String argz[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x and y : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        TwoDim T = new TwoDim(x,y);
        TwoDim T1;
        T1 = T;
        String S = T1.toString();
        System.out.println(S);
        System.out.println("Enter the value of z : ");
        int z = sc.nextInt();
        ThreeDim T2 = new ThreeDim(T1.x,T1.y,z);
        ThreeDim T3;
        T3 = T2;
        String S1 = T3.toString();
        System.out.println(S1);
    }
}