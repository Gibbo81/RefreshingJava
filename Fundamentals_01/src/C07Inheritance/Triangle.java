package C07Inheritance;

public class Triangle extends TwoDShape {
    private String style;
    
    public Triangle(double w, double h, String s) {
        super(w, h);        //Call of he super costructor TwoDShape; must be the first statement
        style=s;
    }
    
    double area()
    {
        return getHeight() * getWidth() /2;
    }
}
