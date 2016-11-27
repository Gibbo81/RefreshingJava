package C07Inheritance;

public class TwoDShape {
    private double width;
    private double height;
    
    TwoDShape(double w, double h)
    {
        width=w;
        height=h;
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
}
