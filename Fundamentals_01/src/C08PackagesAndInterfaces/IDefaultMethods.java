package C08PackagesAndInterfaces;

/*
*With Java 8 is possible to create Interfaces with default methods implementation
*A primary motivation for the default method was to provide a means by which interfaces
*could be expanded without breaking existing code.
*Use abstract class instead
* DO NOT USE: bad practice
*/
public interface IDefaultMethods {
    
    default boolean GetFalse()
    {
        return false;
    }
    
    default boolean GetTrue()
    {
        return true;
    }
    
    /*
    *JDK 8 added another new capability to interface: the ability to define one 
    or more static methods. Like static methods in a class, a static method 
    defined by an interface can be called independently of any object.
    * DO NOT USE: bad practice
    */
    static int GetZero()
    {
        return 0;
    }
    //static interface methods are not inherited by either an implementing class
    //or a subinterface.
}

class UseIDefaultMethods implements IDefaultMethods{}