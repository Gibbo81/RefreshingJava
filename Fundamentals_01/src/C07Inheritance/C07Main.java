package C07Inheritance;

public class C07Main {

    public static void main(String[] args) {
        
        System.out.println("Inherithance");
        Triangle t2 = new Triangle(10,5.47, "strange");
        Triangle t1 = new Triangle(8.4,4.2, "large");
        t2.ShowDim();
        t1.ShowDim();
        System.out.println("--------------------------------------------------");
                
        System.out.println("--------------------------------------------------");
        
        System.out.println("--------------------------------------------------");
    }
    
}
