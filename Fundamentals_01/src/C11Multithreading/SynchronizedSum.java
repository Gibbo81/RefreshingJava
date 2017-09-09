package C11Multithreading;

public class SynchronizedSum implements Runnable {

    protected Add _a;
    protected int[] _values;
    
    public SynchronizedSum (Add a, int[] n)
    {
        _a=a;
        _values = n;
    }
    
    @Override
    public void run() {
        _a.sum(_values);
    }
}

class SynchronizedSumGeneric extends SynchronizedSum {
    
    public SynchronizedSumGeneric(Add a, int[] n) {
        super(a, n);
    }
    
    @Override
    public void run() {
        System.out.println("We can use a no Synchronized version of Add");
        synchronized(_a)
        {
            _a.sum(_values);
        }
    }
}

class Add {
    private int result=0;
    
    synchronized int sum (int[] n)
    {
        for(int x : n)
        {
            result= result+x;
            Sleep(500);
        }     
        return result;
    }
    
    void Sleep( int time)
    {
        try {
            Thread.sleep(time);
        } 
        catch (InterruptedException ex) {}
    }
}

class AddNoSinchro extends Add {
    private int result=0;
    
    @Override
    int sum (int[] n)
    {
        for(int x : n)
        {
            result= result+x;
            System.out.println("Summing " + x + " for thread " + Thread.currentThread().getName() 
                              +" partial result " + result);
            Sleep(500);
        }     
        return result;
    }
}