package C12Generics;

public class SimpleGeneric<T> {
    
    private T ob;
    
    SimpleGeneric (T o)
    {
        ob=o;
    }

    public T getOb() {
        return ob;
    }
            
    public void ShowType(){
        System.out.println("Type of T is: " + ob.getClass().getName());
    }
}
