package C08PackagesAndInterfaces;

public interface ISeries {
    int GetNext();
    void Reset();
    void SetStart(int starting);
}

//An interface can extend another one
interface ISeriesPlus extends ISeries{
    void Optimaze();
}