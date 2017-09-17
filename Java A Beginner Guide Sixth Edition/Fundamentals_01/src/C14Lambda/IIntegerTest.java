package C14Lambda;

public interface IIntegerTest {
    boolean Test(int i);    
}

class StaticReferencesMethods{
    static boolean IsPositive(int n){
        if (n>0)
            return true;
        return false;
    }
}

class NonStaticReferencesMethods{
    private int _n;
    
    NonStaticReferencesMethods(int value){
        _n=value;
    }
    
    boolean IsGreaterThan(int r){
        if (_n>r)
            return true;
        return false;
    }
}
