package C06MoreOnClasses;

public class MultipleConstructor {
    private int _a;
    private int _b;
    private double _c;
    
    MultipleConstructor(int a, int b){
        _a=a;
        _b=b;
        System.out.println("Called first costructor");
    }
    
    MultipleConstructor(int a, int b, double c){
        this(a,b);  //Call the class constructor with 2 parameter
        _c=c;
        System.out.println("Called second costructor");
    }

    @Override
    public String toString(){
        return "MultipleConstructor values are :" +_a +" " +_b +" " +_c;
    }
}