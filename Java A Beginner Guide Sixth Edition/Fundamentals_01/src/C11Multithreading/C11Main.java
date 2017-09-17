package C11Multithreading;

public class C11Main {

    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Java defines two ways in which you can create a runnable object:"); 
        System.out.println("    ● You can implement the Runnable interface."); 
        System.out.println("    ● You can extend the Thread class"); 
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Starting a simple thread susing Runnable Interface");
        Thread d = new Thread(new FirstRunnambleThread(3000), "pippo");
        d.start();
        
        //t.run(); 
        //Do not use this. It's a seample direct call to the run method of the Runnable 
        //Interface. It doesn't start another thread!
        System.out.println("Thread started");
        //As a general rule, a program continues to run until all of its threads have ended. 
        //Thus, having the main thread finish last is not a requirement
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Making the same thing using an estension of thread class");
        Thread t = new ExtendsThread(3500, "pluto");
        t.start();
        System.out.println("Thread started; again");
        System.out.println(String.format("Thread Pluto is alive: %s",t.isAlive()));//Check the status of a thread
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Using .join for waiting a thread");
        Thread paperino = new ExtendsThread(100, "Paperino");
        paperino.start();
        System.out.println("Waiting for paperino");
        paperino.join();  //waiting for the completion of Paprerino
        System.out.println("Paperino compoleted its work, we resumeour!");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Synchro beetween threads using Synchronized keyword");
        Add adder = new Add();
        int[] n = {1,2,3,4,5};
        int[] n2 = {9,10,11,12,13};
        new Thread(new SynchronizedSum(adder, n),"First Sum").start();
        new Thread(new SynchronizedSum(adder, n2),"Second Sum").start();
        System.out.println("Add's sum method is synchronized, untill one of te two complete the other waits");
        System.out.println("---------------------------------------------------------------------------");       
        System.out.println("Synchronized will not work in all cases. You might want to synchronize "
                + "access to some method that is not modified by synchronized. "
                + " --> We will use a synchronized block.");
        
        AddNoSinchro ans = new AddNoSinchro();
        new Thread(new SynchronizedSumGeneric(ans, n2),"First synchronized Block Sum").start();
        new Thread(new SynchronizedSumGeneric(ans, n),"Second synchronized Block Sum").start();
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("This is how suspend - resume and stop is implemeted in java ...."); 
        System.out.println("Do it manually and don't brake the balls...");
        System.out.println("SAD SAD SAD SAD SAD SAD SAD");
        StopSuspendeResume ob1 = new StopSuspendeResume("My Thread");
        Thread.sleep(1000); // let ob1 thread start executing
        ob1.mysuspend();
        System.out.println("Suspending thread.");
        Thread.sleep(1000);
        ob1.myresume();
        System.out.println("Resuming thread.");
        Thread.sleep(1000);
        ob1.mysuspend();
        System.out.println("Suspending thread.");
        Thread.sleep(1000);
        ob1.myresume();
        System.out.println("Resuming thread.");
        Thread.sleep(1000);
        ob1.mysuspend();
        System.out.println("Stopping thread.");
        ob1.mystop();
        ob1.thrd.join();
        System.out.println("Main thread exiting.");
    }   
}