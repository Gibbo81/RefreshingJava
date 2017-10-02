package Ch03_methodsCommonToAllObject;

public class Main {
    public static void main(String[] args) {

        System.out.println("Using composition instead of inheritance is possible to expand a class");
        System.out.println(" and keep a Equal override working");
        ColoredPoint cp1 = new ColoredPoint("green", 13, 14);
        ColoredPoint cp2 = new ColoredPoint("blue", 33, 64);
        ColoredPoint cp3 = new ColoredPoint("green", 13, 14);
        System.out.println("cp1.equals(cp2) : " + (cp1.equals(cp2)));
        System.out.println("cp1.equals(cp3) : " + (cp1.equals(cp3)));
        System.out.println("cp3.equals(cp2) : " + (cp3.equals(cp2)));
    }
}