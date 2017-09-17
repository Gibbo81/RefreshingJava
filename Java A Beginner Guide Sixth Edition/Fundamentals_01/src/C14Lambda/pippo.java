package C14Lambda;

interface IsComparable<T> {
    boolean Test(T x, T y);
}

//This is a generic method (page 503) a method that is generic in a non generic class
class MyGeneric{
    static <T> boolean Compare (T x, T y){
        return false;
    }
}

public class pippo implements IsComparable<Object>{

    @Override
    public boolean Test(Object x, Object y) {
        return true;
    }
    
    //This is a generic method
    static <K> boolean GenericMethod(K primo, K Secondo){
        return true;
    }
}

