package C12Enumerations_Autoboxing_StaticImport_Annotations;

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

        System.out.println("---------------------------------------------------------------------------");
        
        System.out.println("---------------------------------------------------------------------------");
        
        System.out.println("---------------------------------------------------------------------------");

        System.out.println("---------------------------------------------------------------------------");
    }
    
}
