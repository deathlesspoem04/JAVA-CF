package P2;

public class C //  Prime or Not
{
    public void Prime(int n)
    {
        boolean flag = false;
        for(int i = 2; i <= n/2; ++i)
        {
            if(n % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(n + " is a Prime Number.");
        else
            System.out.println(n + " is not a Prime Number.");
    }
}