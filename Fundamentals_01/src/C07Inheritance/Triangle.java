package C07Inheritance;

public class Triangle extends TwoDShape {
    private String style;
    
    public Triangle(double w, double h, String s) {
        super(w, h);        //Call of he super costructor TwoDShape; must be the first statement
        style=s;
    }
    
    public Triangle(Triangle t)
    {
        super(t);
        style = t.style;
    }
    
    double area()
    {
        return getHeight() * getWidth() /2;
    }
    
    public void print()
    {
        super.print();
        System.out.println(String.format("style: %s",style));
    }

    public void Area() {       
        System.out.println(String.format("Area is %s", getWidth()*getHeight()/2));
    }
}
