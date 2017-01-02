
package C12Generics;

public class GenericUpperBound<T extends IReadable> {
    
    private T value;
    
    public GenericUpperBound(T val)
    {
        value= val;
    }
    
    @Override
    public String toString(){
        return "My T is: "+value.ReadValue();
    }
    
    public boolean Check(GenericUpperBound<IReadable> t){
        if (toString().equals(toString()))
            return true;
        return false;
    }
    
    //Or i can use a wildcard argument<?>: match any type of GenericUpperBound object
    public boolean CheckTwo(GenericUpperBound<?> t){
        if (toString().equals(toString()))
            return true;
        return false;
    }
    
    //we can create general methods (also static) that use theri specific generics 
    public <U extends Number> boolean IsGreaterThan10(U number){
        if (number.doubleValue()>10)
            return true;
        return false;
    }
}
