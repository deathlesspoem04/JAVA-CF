package P1;

public class A // Fibonacci, Sum_of_Digits
{
    public void fibonacci(int n)
    {
        int t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }

    public void Sum(int d)
    {
        int sum=0;
        while(d!=0)
        {
            sum = sum + d%10;
            d = d / 10;
        }
        System.out.println("Sum of Digits :"+sum);
    }
}