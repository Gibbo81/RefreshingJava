package Ch03_methodsCommonToAllObject;

public class Main {
    public static void main(String[] args) {

        System.out.println("Using composition instead of inheritance is possible to expand a class");
        System.out.println(" and keep a Equal override working");
        Colored3DPoint cp1 = new Colored3DPoint("green", 13, 14, 1);
        Colored3DPoint cp2 = new Colored3DPoint("blue", 33, 64, 2);
        Colored3DPoint cp3 = new Colored3DPoint("green", 13, 14, 1);
        System.out.println("cp1.hashCode() : " + (cp1.hashCode()));
        System.out.println("cp2.hashCode() : " + (cp2.hashCode()));
        System.out.println("cp3.hashCode() : " + (cp3.hashCode()));
        System.out.println("cp1.equals(cp2) : " + (cp1.equals(cp2)));
        System.out.println("cp1.equals(cp3) : " + (cp1.equals(cp3)));
        System.out.println("cp3.equals(cp2) : " + (cp3.equals(cp2)));
    }
}