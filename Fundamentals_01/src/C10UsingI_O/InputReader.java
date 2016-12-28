package C10UsingI_O;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;



public class InputReader {
    private BufferedReader _br;
    
    public InputReader(InputStream in)
    {
        _br = new BufferedReader(new InputStreamReader(in));
    }
    
    public String ReadString() throws IOException
    {
        return _br.readLine();
    }
    
    public int ReadInt() throws IOException
    {
        return Integer.parseInt(_br.readLine());
    }
    
    public double ReadDouble() throws IOException
    {
        return Double.parseDouble(_br.readLine());
    }
}
