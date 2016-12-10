package C08PackagesAndInterfaces;

public class RatedBook extends C08PackagesAndInterfaces.InsideA.Book {
    private int _rate;
    
    public RatedBook(String title, int year, int rate)
    {
        super(title, year);
        _rate = rate;    
    }
    
    //created here but use the data from super class!
    public void Show()
    {
        super.Show();
        System.out.println(String.format("The book rate is %s", _rate));
    }
    
    public String getTitle() {
        return _title;
    }

    public void setTitle(String _title) {
        this._title = _title;
    }

    public int getYear() {
        return _year;
    }

    public void setYear(int _year) {
        this._year = _year;
    }
    
    
}
