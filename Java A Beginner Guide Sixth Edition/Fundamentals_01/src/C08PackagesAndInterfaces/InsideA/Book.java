package C08PackagesAndInterfaces.InsideA;

public class Book {
    protected String _title;
    protected int _year;
    
    public Book(String title, int year)
    {
        _title = title;
        _year  = year;
    }
    
    public void Show()
    {
        System.out.println(String.format("The book %s was published in %s", _title, _year));
    }
}
