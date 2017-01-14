package Mixed;

public class mixedMain {

    public static void main(String[] args) {
        System.out.println("Anonymous class are nameless class created on the run to implement an interface");
        Doing d = new Doing(){  //create an anonymous class
                    public void DoOne(int n){
                       System.out.println("print: "+n); 
                    };
                    public double DoTwo(double a, double b){
                        return a+b;
                    };
                };
        d.DoOne(159);
        System.out.println("d.DoTwo(12.45,345.609); "+d.DoTwo(12.45,345.609));
        System.out.println("If we have a functional interface  we can also use a lambda");
        System.out.println("---------------------------------------------------------------------------");
        
        System.out.println("---------------------------------------------------------------------------");
    
        System.out.println("---------------------------------------------------------------------------");
        
        System.out.println("---------------------------------------------------------------------------");
    }
    
}
