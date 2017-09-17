package C11Multithreading;

public class ExtendsThread extends Thread {
    private int _sleepTime;
    
    public ExtendsThread(int sleep, String s)
    {
        super(s);
        _sleepTime= sleep;       
    }
       
    @Override
    public void run() {
        System.out.println(String.format("Thread %s :This class extends Thread",Thread.currentThread().getName()));
        System.out.println(String.format("Thread %s :Starting the thread",Thread.currentThread().getName()));
        Sleep(_sleepTime);  
        System.out.println(String.format("Thread %s :After the sleep working",Thread.currentThread().getName()));
        Sleep(_sleepTime);
        System.out.println(String.format("Thread %s :Completed",Thread.currentThread().getName()));
    }
    
    private void Sleep( int time)
    {
        try {
            Thread.sleep(time);
        } 
        catch (InterruptedException ex) {}
    }
}
