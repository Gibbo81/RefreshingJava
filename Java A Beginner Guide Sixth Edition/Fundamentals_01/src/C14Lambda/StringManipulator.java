package C14Lambda;

public class StringManipulator {
    
    private String _base;
    
    public StringManipulator(String s){
        _base=s;
    }
    
    public String Manipulate(IWorkWithString worker){
        return worker.DoJob(_base);
    } 
}
