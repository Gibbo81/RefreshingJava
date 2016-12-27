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

    @Override
    public void close() throws IOException {
        _output.close();
    }
}