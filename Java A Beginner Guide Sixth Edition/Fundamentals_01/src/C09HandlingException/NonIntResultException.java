package C09HandlingException;

public class NonIntResultException extends Exception {
    private int _a;
    private int _b;
    
    public NonIntResultException(int a, int b, String msg, Throwable thr){
        super();
        _a=a;
        _b=b;
    }
    
    public NonIntResultException(int a, int b)
    {    
        _a=a;
        _b=b;
    }
    
    public String toString()
    {
        String innerError="";
        Throwable e = this.getCause();
        if (e !=null)
            innerError = ", Inner exception " + e.toString();
        return String.format("Result of %s/%s is not an integer%s", _a,_b, innerError);
    }
}
