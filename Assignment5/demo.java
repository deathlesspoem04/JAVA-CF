import java.util.Scanner;
public class demo
{
    public static void main(String argz[])
    {
        Scanner sc = new Scanner (System.in);
        inter.inter1 a = new interf();
        int ch;
        boolean flag = false;
        while(!flag)
        {
            System.out.println("Enter 1 for GCD \nEnter 2 for Package Problem\nEnter 3 to exit :");
            ch = sc.nextInt();
            switch(ch) {
            case 1:{
            System.out.println("Enter the value of x and y to find the GCD :");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int hcf = a.gcd(x, y);
            System.out.println("GCD = " + hcf);
            break;}
            case 2: {
                a.result();
                break;
            }
                case 3:{
                    flag = true;
                    break;
                }
        }
        }
    }
}
