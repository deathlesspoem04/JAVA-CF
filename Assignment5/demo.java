import java.util.Scanner;
public class demo
{
    public static void main(String argz[])
    {
        Scanner sc = new Scanner (System.in);
        inter.inter1 a = new interf();
        System.out.println("Enter the value of x and y to find the GCD :");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int hcf = a.gcd(x,y);
        System.out.println("GCD = "+hcf);
    }
}
