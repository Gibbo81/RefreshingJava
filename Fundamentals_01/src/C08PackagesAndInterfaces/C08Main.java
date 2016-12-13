package C08PackagesAndInterfaces;

import C08PackagesAndInterfaces.InsideA.*; //Import all

public class C08Main implements IConstant{

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");
        System.out.println("Inherithance beetween differente packages!");
        RatedBook rb = new RatedBook("Java 8", 2014,5);
        Book b= new Book("Java 8", 2014);
        rb.Show();
        System.out.print("Basic one: ");
        b.Show();
        System.out.println("--------------------------------------------------");
        System.out.println("Working with interface");
        Serie s = new Serie();
        s.SetStart(14);
        System.out.println(String.format("Give me next value: %s",s.GetNext()));
        System.out.println(String.format("Give me next value: %s",s.GetNext()));
        System.out.println(String.format("Give me next value: %s",s.GetNext()));
        System.out.println(String.format("Give me current value: %s",s.GetActual()));
        s.SetStart(100);
        s.Reset();
        System.out.println(String.format("Give me current value: %s",s.GetActual()));
        System.out.println(String.format("Give me next value: %s",s.GetNext()));
        System.out.println(String.format("Give me current value: %s",s.GetActual()));
        System.out.println("--------------------------------------------------");
        System.out.println("Variables can be declared in an interface, but they are implicitly public, static, and final");
        System.out.println(String.format("Read from interface Min: %s", MIN));
        System.out.println(String.format("Read from interface Max: %s", MAX));
        System.out.println(String.format("Read from interface Error: '%s'", ERROR));
        System.out.println("DO NOT USE: bad practice");
        System.out.println("--------------------------------------------------");
        System.out.println("With Java 8 is possible to create Interfaces with default methods implementation");
        UseIDefaultMethods u= new UseIDefaultMethods();
        System.out.println(String.format("Use default implementatio of GetTrue(): %s", u.GetTrue()));
        System.out.println(String.format("Use default implementatio of GetFalse(): %s", u.GetFalse()));        
        System.out.println("DO NOT USE: bad practice");
        System.out.println("--------------------------------------------------");
        System.out.println("With Java 8 interface can declare also static methods");
        System.out.println(String.format("Use static method IDefaultMethods.GetZero(): %s", 
                                          IDefaultMethods.GetZero()));        
        System.out.println("static interface methods are not inherited by either an implementing class or a subinterface.");
        System.out.println("DO NOT USE: bad practice");
        System.out.println("--------------------------------------------------");
    }  
}