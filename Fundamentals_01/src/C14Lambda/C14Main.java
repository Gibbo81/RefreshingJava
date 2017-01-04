package C14Lambda;

public class C14Main {

    public static void main(String[] args) {
        
//      lambda expression is not executed on its own. Rather, it forms the implementation of 
//      the abstract method defined by the functional interface that specifies its target type
        IMyvalue functional_interface   = ()    -> 74.7;
        IMyvalue2 functional_interface2 = x     -> x+1;
        IMyvalue3 functional_interface3 = (x,y) -> x+1-y;
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

        System.out.println("---------------------------------------------------------------------------");
        
        System.out.println("---------------------------------------------------------------------------");

        System.out.println("---------------------------------------------------------------------------");
        
        System.out.println("---------------------------------------------------------------------------");

        System.out.println("---------------------------------------------------------------------------");
    }
    
}
