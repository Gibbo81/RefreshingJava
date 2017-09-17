package C10UsingI_O;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BinaryReadFromFile implements AutoCloseable {
    
    private FileInputStream _input;
    
    public BinaryReadFromFile(String source) throws FileNotFoundException
    {
        _input = new FileInputStream(source);
    }
    
    public char ReadBytes() throws IOException
    {
        return (char)_input.read();
    }
    
    public String ReadAll() throws IOException
    {
        int i=0;
        String result = "";
        do
        {
            i= _input.read();
            if (i!=-1)
                result = result + (char)i;
        }
        while (i!=-1);
        return result;
    }
    
    public void close() throws Exception {
        _input.close();
    }
}
