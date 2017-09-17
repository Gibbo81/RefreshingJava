package C10UsingI_O;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryWriteToFile implements AutoCloseable {
    
    private FileOutputStream _output;
    
    public BinaryWriteToFile(String destination) throws FileNotFoundException
    {
        _output = new FileOutputStream(destination);
    }
    
    public void WriteAll(String toWrite) throws IOException
    {
        _output.write(toWrite.getBytes());      
    }

    //It's not really necessary. It only make a check to see if a super class has a method
    //with that signature, or give an error. You can make override without @Override
    @Override       
    public void close() throws IOException {
        _output.close();
    }
}