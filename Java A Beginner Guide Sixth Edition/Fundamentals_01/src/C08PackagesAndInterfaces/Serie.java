package C08PackagesAndInterfaces;

//First extends and after implements. FIXED position
public class Serie extends AbstractSeries implements ISeries, ISeriesActual {

    private int _actual = 0;
    
    public int GetNext() {
        return ++_actual;
    }

    public void Reset() {
        _actual = _starting;
    }

    public int GetActual() {
        return _actual;
    }   
}