package C08PackagesAndInterfaces;

public class Serie implements ISeries, ISeriesActual {

    private int _actual = 0;
    private int _starting = 0;
    
    public int GetNext() {
        return ++_actual;
    }

    public void Reset() {
        _actual = _starting;
    }

    public void SetStart(int starting) {
        _starting = starting;
    }

    public int GetActual() {
        return _actual;
    }   
}