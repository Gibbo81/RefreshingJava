package C03ProgramControlStatements;

import java.io.IOException;

public class InputReader {
    
    public static String ReadString() throws IOException {
        
        BufferCleaner();
      
        byte[] buffer = new byte[3000];
        String result = "";
        int count = System.in.read(buffer);
        for (int x = 0; x < count; x++) {
            result = result + (char) buffer[x];
        }
        return result;
    }
    public static void BufferCleaner() throws IOException
    {
        while((System.in.available()>0))
        {
            char ignore; //Discharge char pending by looking in the buffer for the end of the line
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
        }
    }
}
