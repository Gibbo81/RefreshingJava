package C11Multithreading;

public class C11Main {

    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Java defines two ways in which you can create a runnable object:"); 
        System.out.println("    ● You can implement the Runnable interface."); 
        System.out.println("    ● You can extend the Thread class"); 
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Starting a simple thread susing Runnable Interface");
        new Thread(new FirstRunnambleThread(3000), "pippo").start();
        //t.run(); 
        //Do not use this. It's a seamèple direct call to the run method of the Runnable 
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
        paperino.join();  //waiting for the copletition of Paprerino
        System.out.println("Paperino compoleted its work, we resumeour!");
        System.out.println("---------------------------------------------------------------------------");
        
        System.out.println("---------------------------------------------------------------------------");
        
        System.out.println("---------------------------------------------------------------------------");

        System.out.println("---------------------------------------------------------------------------");
        
        System.out.println("---------------------------------------------------------------------------");
        
        System.out.println("---------------------------------------------------------------------------");

        System.out.println("---------------------------------------------------------------------------");
    }   
}