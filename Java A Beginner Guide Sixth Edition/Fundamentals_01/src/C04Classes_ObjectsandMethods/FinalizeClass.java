
package C04Classes_ObjectsandMethods;

public class FinalizeClass {
    private int x;
    
    public FinalizeClass(int value)
    {
        x = value;
    }
    
    protected void finalize()
    {
        System.out.println("Garbege colector finalize istance number: " + x);
    }
    
    public void Cicle(int k)
    {
        FinalizeClass c = new FinalizeClass(k);
    }
}
