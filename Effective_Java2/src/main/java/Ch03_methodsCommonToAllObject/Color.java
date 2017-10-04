package Ch03_methodsCommonToAllObject;

public class Color {

    private final String color;

    public Color(String color) {
        this.color = color;
    }

    @Override
    public boolean equals (Object o)
    {
        if (!(o instanceof Color))
            return false;
        return color ==((Color)o).color;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + color.hashCode();
        return result;
    }
}