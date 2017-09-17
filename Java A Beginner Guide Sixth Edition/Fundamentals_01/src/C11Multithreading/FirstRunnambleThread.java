package C11Multithreading;

public class FirstRunnambleThread implements Runnable {

    private int _sleepTime;
    
    public FirstRunnambleThread(int sleep)
    {
        _sleepTime= sleep;
    }
    
    @Override
    public void run() 
    {
        System.out.println(String.format("Thread %s :Starting the thread with priority %s",
                                            Thread.currentThread().getName(), 
                                            Thread.currentThread().getPriority()));
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
