package C08PackagesAndInterfaces;

import C08PackagesAndInterfaces.InsideA.*; //Import all

public class C08Main {

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
        
        System.out.println("--------------------------------------------------");
        
        System.out.println("--------------------------------------------------");
        
        System.out.println("--------------------------------------------------");
    }  
}