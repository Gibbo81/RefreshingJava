package C14Lambda;

import java.io.IOException;
import java.util.function.Predicate;

public class C14Main {

    public static void main(String[] args) throws IOException {
        
//      lambda expression is not executed on its own. Rather, it forms the implementation of 
//      the abstract method defined by the functional interface that specifies its target type
        IMyvalue  functional_interface  = ()    -> 74.7;
        IMyvalue2 functional_interface2 = x     -> x+1;
        IMyvalue3 functional_interface3 = (x,y) -> {
            double result = x+1;
            return result + y;
        };
        double d = 100.002;
        functional_interface = () -> d;  //d must be final or effectively final
        //d = 00.9;     //This would give a compile error
        System.out.println(functional_interface.GetValue());
        System.out.println(functional_interface3.GetValue(d,42));
//      In the background an instance of a class is automatically created that implements the 
//      functional interface, with the lambda expression defining the behavior of the abstract 
//      method declared by the functional interface
        System.out.println("lambda expression gives us a way to transform a code segment into an objec");
        System.out.println("---------------------------------------------------------------------------");

        System.out.println("Of course we can also use generic interfaces");
        IsComparable<Integer> IsFactor = (x, y) -> (x%y)==0; 
        System.out.println(IsFactor.Test(34,30));
        System.out.println(IsFactor.Test(34,17));
        System.out.println("---------------------------------------------------------------------------");
        
        System.out.println("Lambda can be use also as parameters");
        String base="Happy new year!";
        StringManipulator sm = new StringManipulator(base);
        String finals = sm.Manipulate(x ->{         //Signature String Manipulate(IWorkWithString worker){
                            String result="";
                            for (int u= x.length()-1; u>=0; u--)
                                result = result+x.charAt(u);
                            return result;
                        });
        System.out.println(String.format("Bse string is: %s, inverted is:  %s", base,finals));
        System.out.println("---------------------------------------------------------------------------");
        
        System.out.println("A lambda can throw an exception, but it must declare as throwable "
                + "inside the functional interface: double GetValue() throws IOException;");      
        functional_interface   = ()-> {throw new IOException("Forced Throw");};
        try
        {
            functional_interface.GetValue();
        }
        catch (IOException e){
            System.out.println("Catch exception: " + e);
        }      
        System.out.println("---------------------------------------------------------------------------");
        
        System.out.println("A functional interface can also be used with a method references");
        System.out.println("Here we use a static method ClassName::MethodName");
        IIntegerTest test = StaticReferencesMethods::IsPositive;
        System.out.println("test.Test(10): " +test.Test(10));
        System.out.println("test.Test(-1): " +test.Test(-1));
        System.out.println("---------------------------------------------------------------------------");
        
        System.out.println("Use a non static method IstanceName::MethodName");
        NonStaticReferencesMethods nonstatic = new NonStaticReferencesMethods(50);
        test = nonstatic::IsGreaterThan;
        System.out.println("test.Test(10): " +test.Test(10));
        System.out.println("test.Test(100): " +test.Test(100));
        System.out.println("---------------------------------------------------------------------------");
        
        System.out.println("It's possible to use generic method for generic interfaces: interface IsComparable<T>");
        IsComparable<Integer> generic = MyGeneric::<Integer>Compare; 
        System.out.println("generic.Test(10, 936): " + generic.Test(10, 936));       
        System.out.println("---------------------------------------------------------------------------");

        System.out.println("It's possible to use some dfeault functional interface"
                + " Founded inside java.util.function.");
        Predicate<Integer> p = x -> (x%2)==0;
        
        System.out.println("java.util.function.Predicate: Predicate<Integer> p = x -> (x%2)==0");
        System.out.println("is ten even {p.test(10)}: " + p.test(10));
        System.out.println("is seven even {p.test(7)}: " + p.test(7));       
        System.out.println("---------------------------------------------------------------------------");
    } 
}