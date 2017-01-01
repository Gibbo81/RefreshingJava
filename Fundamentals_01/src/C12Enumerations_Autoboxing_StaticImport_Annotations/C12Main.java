package C12Enumerations_Autoboxing_StaticImport_Annotations;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import static java.lang.System.*;

public class C12Main {

    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Using a simple ENUM");
        Transport t= Transport.ship;
        System.out.println(t);
        if (t == Transport.ship)
            System.out.println("Yes it's value is ship");
        else
            System.out.println("o it's value is not ship");
        for (Transport tr : Transport.values())
            System.out.print(tr +" ");
        System.out.println("");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Java Enum can have method, variable and costructor");  
        for (TransportWithSpeed tws : TransportWithSpeed.values())
            System.out.println(tws +" ");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Semaphore made with enum");
        
        LightSemaphore ls1 = new LightSemaphore();
        LightSemaphore ls2 = new LightSemaphore(LightColor.yellow);
        
        Thread t1  = new Thread(ls1, "first");
        Thread t2  = new Thread(ls2, "second");
        t1.start();
        t2.start();
        Thread.sleep(15000);
        ls1.Stop();
        ls2.Stop();
        t1.join();
        t2.join();
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("AutoBox and Auto-unbox.....Useful?");
        Integer i = 100;    //auto-box
        int pi = i;         //auto-unbox
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("It's possible to use static import to 'import' static member of a class");
        double a =12;
        double b =7;
        double c =6;
        out.println("sqrt(pow(a,c)*b): " +sqrt(pow(a,c)*b));        
                
                
        System.out.println("---------------------------------------------------------------------------");
        
        System.out.println("---------------------------------------------------------------------------");

        System.out.println("---------------------------------------------------------------------------");
    
    }   
}