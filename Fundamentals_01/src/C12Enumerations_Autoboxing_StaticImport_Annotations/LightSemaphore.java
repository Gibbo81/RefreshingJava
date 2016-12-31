package C12Enumerations_Autoboxing_StaticImport_Annotations;

enum LightColor{
    red, green, yellow
}

public class LightSemaphore implements Runnable {
    private LightColor _lc;
    private boolean stop = false;
    
    public void Stop()
    {
        stop = true;
    }
    
    LightSemaphore (LightColor lc)
    {
        _lc = lc;
    }
    
    LightSemaphore ()
    {
        _lc = LightColor.red;
    }
    
    @Override
    public void run() {
        while (!stop)
        {
            try{
                switch(_lc){
                    case red:
                        Thread.sleep(3000);
                        break;
                    case green:
                        Thread.sleep(2000);
                        break;
                    case yellow:
                        Thread.sleep(1000);
                } 
            }
            catch (InterruptedException e){
                System.out.println("-*-*-*-*-*-*-*-*-*-*-");
            }
            SwitchColor();
        }
    }
    
    private void SwitchColor()
    {
        switch(_lc){
            case red:
                _lc = LightColor.green;
                System.out.println(Thread.currentThread().getName() +" switch from " +LightColor.red + " to "+LightColor.green);
                break;
            case green:
                _lc = LightColor.yellow;
                System.out.println(Thread.currentThread().getName() +" switch from " +LightColor.green + " to "+LightColor.yellow);
                break;
            case yellow:
                _lc = LightColor.red;
                System.out.println(Thread.currentThread().getName() +" switch from " +LightColor.yellow + " to "+LightColor.red);
        } 
    }

    public LightColor getLc() {
        return _lc;
    }
}
