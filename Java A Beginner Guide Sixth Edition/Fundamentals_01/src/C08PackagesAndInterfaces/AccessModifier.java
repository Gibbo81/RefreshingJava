package C08PackagesAndInterfaces;

public class AccessModifier {   //page 272
    private int a;      //Visible within same class
    int a1;             //Visible within same package "DEFAULT level"
    protected int a2;   //Visible within same package and by other package's subclasses
    public int a3;      //Always Visible
}
