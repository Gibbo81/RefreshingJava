package C07Inheritance;

public class C07Main {

    final static double PIGRECO = 3.14;    //This is the same of C# const
    
    public static void main(String[] args) {
        
        System.out.println("Inherithance");
        Triangle t2 = new Triangle(10,5.47, "strange");
        Triangle t1 = new Triangle(8.4,4.2, "large");
        t2.ShowDim();
        t1.ShowDim();
        System.out.println("--------------------------------------------------");
        t1= new Triangle(65.4,15.9, "large");
        t2= new Triangle(t1);
        TwoDShape t3 = new Triangle(99.4,487.67, "large");
        t3.print();
        t2.print();
        t3.Area();
        System.out.println("--------------------------------------------------");
        System.out.println("Final Class variable");
        System.out.println(String.format("Final PiGreco variable: %s",PIGRECO));
        
        
        System.out.println("--------------------------------------------------");
    }
    
}
