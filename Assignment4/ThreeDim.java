
public class ThreeDim extends TwoDim
{
    int z;
    ThreeDim()
    {}

    ThreeDim(int x,int y,int z)
    {
        super(x,y);
        this.z = z;
    }

    @Override
    public String toString() {
        return String.format("x = "+ x +"\ny = "+y+"\nz = "+ z);
    }
}