
public class TwoDim
{
     int x, y;

    TwoDim()
    {}

    TwoDim(int x,int y)
    {

        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("x = "+ x +"\ny = "+y);
    }
}