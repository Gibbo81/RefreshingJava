package Ch03_methodsCommonToAllObject;

/**
 * Using composition instead of inheritance is possible to expand a class and keep a Equal override working
 */
public class Colored3DPoint {

    private final Color color;
    private final Point point;
    private int z;

    public Colored3DPoint(String color, int x, int y, int z) {
        this.color = new Color(color);
        this.z = z;
        this.point = new Point(x,y);
    }

    public Point AsPoint(){
        return point;
    }

    @Override
    public boolean equals(Object o){ //if o is null we must return null not a null reference exception
        if (!(o instanceof Colored3DPoint))
            return false;
        Colored3DPoint co = (Colored3DPoint)o;
        return co.point.equals(point) && co.color.equals(color) && co.z==z;
    }

    /*You must override hashCode in every class that overrides equals. Failure to do so
    will result in a violation of the general contract for Object.hashCode, which will
    prevent your class from functioning properly in conjunction with all hash-based
    collections, including HashMap, HashSet, and Hashtable.*/
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + z;
        result = 31 * result + color.hashCode();
        result = 31 * result + point.hashCode();
        return result;
    }
}