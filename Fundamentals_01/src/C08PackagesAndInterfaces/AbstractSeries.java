package C08PackagesAndInterfaces;

/*
This class must be abstract because iplements only one of the ISeries's methods
*/
public abstract class AbstractSeries implements ISeries {
    protected int _starting = 0;
    
    public void SetStart(int starting) {
    _starting = starting;
    }
}
