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
}

class UseIDefaultMethods implements IDefaultMethods{
    
}
