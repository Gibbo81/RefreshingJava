package C14Lambda;

interface IsComparable<T> {
    boolean Test(T x, T y);
}

class MyGeneric{
    static <T> boolean Compare (T x, T y){
        return false;
    }
}
