
public class interf implements inter.inter1 {
    public int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        if (a == b)
            return a;
        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }

    public void result() {
        test1 T = new test1();
        T.Display();
    }
}
