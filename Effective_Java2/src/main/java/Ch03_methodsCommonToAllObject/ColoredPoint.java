package Ch03_methodsCommonToAllObject;

/**
 * Using composition instead of inheritance is possible to expand a class and keep a Equal override working
 */
public class ColoredPoint {

    private final Color color;
    private final Point point;

    public ColoredPoint(String color, int x, int y) {
        this.color = new Color(color);
        this.point = new Point(x,y);
    }

    public Point AsPoint(){
        return point;
    }

    @Override
    public boolean equals(Object o){
        if (!(o instanceof ColoredPoint))
            return false;
        ColoredPoint co = (ColoredPoint)o;
        return co.point.equals(point) && co.color.equals(color);
    }
}