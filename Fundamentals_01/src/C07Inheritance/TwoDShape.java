package C07Inheritance;

public class TwoDShape {
    private double width;
    private double height;
    
    public TwoDShape(double w, double h)
    {
        width = w;
        height = h;
    }

    public TwoDShape(TwoDShape tds)
    {
        width = tds.width;
        height = tds.height;
    }
    
    public double getWidth() {
        return width;
    }

    public void setWidth(double weight) {
        this.width = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public void ShowDim()
    {
        System.out.println("Width is "+width+" and height is "+ height);
    }
    
    public void print()
    {
        System.out.println(String.format("width: %s, height: %s", width, height));
    }
}
