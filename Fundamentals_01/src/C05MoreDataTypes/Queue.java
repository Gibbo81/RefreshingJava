package C05MoreDataTypes;

public class Queue {
    private int[] data;
    private int readPosition=0;
    private int writePosition=0;
    
    public Queue(int dimension)
    {
        data = new int[dimension];
    }
    
    public void Insert(int value)
    {
        data[writePosition]= value;
        UpdateWritePosition();
    }
    
    public int Read()
    {
        
        int result = data[readPosition];
        data[readPosition]=0;   //0 it's the ampty value
        UpdateReadePosition();
        return result;
    }
    
    public void UpdateWritePosition()
    {
        if (writePosition< (data.length-1))
            writePosition++;
        else
            writePosition=0;
    }
    
    public void UpdateReadePosition()
    {
        if (readPosition< (data.length-1))
            readPosition++;
        else
            readPosition=0;
    }
}
