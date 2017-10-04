package Ch03_methodsCommonToAllObject;

public class Point {

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o)
    {
        if (!(o instanceof Point))
            return false;
        Point po = (Point)o;
        return ( x == po.x && y == po.y);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + x;
        result = 31 * result + y;
        return result;
    }
}