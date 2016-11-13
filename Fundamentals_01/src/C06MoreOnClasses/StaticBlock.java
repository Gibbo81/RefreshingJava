package C06MoreOnClasses;

public class StaticBlock {
    
    static double val1;
    static double val2;
    
    static 
    {
        System.out.println("Inside static block");
        System.out.println("Run when the class is first loaded {First object created}");
        val1 = 435.243;
        val2 = 52532.89;
    }
    
    public StaticBlock(String s)
    {
        System.out.println("Costructor is running with parameter: " + s);
    }
}