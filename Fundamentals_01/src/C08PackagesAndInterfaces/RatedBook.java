package C08PackagesAndInterfaces;

import C08PackagesAndInterfaces.InsideA.*;
//If we don't wont to use the import we can specify all the route
//public class RatedBook extends C08PackagesAndInterfaces.InsideA.Book { 
public class RatedBook extends Book {
    private int _rate;
    
    public RatedBook(String title, int year, int rate)
    {
        super(title, year);
        _rate = rate;    
    }
    
    //created here but use the data from super class!
    @Override
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