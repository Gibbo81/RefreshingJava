package C12Generics;

import C12Enumerations_Autoboxing_StaticImport_Annotations.LightSemaphore;

public class C13Main {

    public static void main(String[] args) {
        System.out.println("GENERICS firast use");
        SimpleGeneric<Integer> simpleint = new SimpleGeneric<>(34); //Not need to specify a 2° time!
        SimpleGeneric<String>  simplestr = new SimpleGeneric<>("thirtyfour");
        SimpleGeneric<LightSemaphore>  simplels = new SimpleGeneric<>(new LightSemaphore());
        TestGeneric(simpleint);
        TestGeneric(simplestr);
        TestGeneric(simplels);
        System.out.println("Java's GENERICS only works with references type");
        
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("It's possible to have generics a little less generic");
        System.out.println("We can specify a class/interface to wich all generic must inheritance <T extends IReadable>");
        GenericUpperBound<IReadable> ra = new GenericUpperBound<>(new ReadableA());
        GenericUpperBound<IReadable> rb = new GenericUpperBound<>(new ReadableB());        
        //GenericUpperBound<LightSemaphore> rc = new GenericUpperBound<>(new LightSemaphore());         
        //This would not compile: LightSemaphore is not inside bound of type-variable T 
        //System.out.println(ra.Check(rb));
        System.out.println(ra);
        System.out.println(rb);
        System.out.println(ra.Check(ra));
        
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("It's possinble to use wildcard argument<?> if i do not "
                + "wont to use generic (IReadable) in the first place"); 
        GenericUpperBound<ReadableA> rc = new GenericUpperBound<>(new ReadableA());
        GenericUpperBound<ReadableB> rd = new GenericUpperBound<>(new ReadableB());        
        System.out.println(rc.CheckTwo(rd));
        
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Can create general methods (also static) that use theri specific generics ");       
        System.out.println("public <U extends Number> boolean IsGreaterThan10(U number){...");
        System.out.println("rc.IsGreaterThan10(34): " + rc.IsGreaterThan10(34));
        System.out.println("ra.IsGreaterThan10(9.57)" + ra.IsGreaterThan10(9.57));
        
        System.out.println("---------------------------------------------------------------------------");
        
        System.out.println("---------------------------------------------------------------------------");

        System.out.println("---------------------------------------------------------------------------");
    }
    
    private static void TestGeneric(SimpleGeneric in)
    {
        System.out.println(in.getOb());
        in.ShowType();
    }
}
