package C14Lambda;

public class C14Main {

    public static void main(String[] args) {
//      lambda expression is not executed on its own. Rather, it forms the implementation of 
//      the abstract method defined by the functional interface that specifies its target type
        IMyvalue functional_interface = () -> 74.7;
        double d = 100.002;
        IMyvalue functional_interface_2 = () -> d;  //d must be final or effectively final
        //d = 00.9;     //This would give a compile error
        System.out.println(functional_interface_2.GetValue());
        System.out.println("---------------------------------------------------------------------------");

        System.out.println("---------------------------------------------------------------------------");
        
        System.out.println("---------------------------------------------------------------------------");

        System.out.println("---------------------------------------------------------------------------");
        
        System.out.println("---------------------------------------------------------------------------");

        System.out.println("---------------------------------------------------------------------------");
    }
    
}
