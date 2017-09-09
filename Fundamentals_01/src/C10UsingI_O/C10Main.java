package C10UsingI_O;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class C10Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        System.out.println("--------------------------------------------------");
        System.out.println("Read from binary file");
        ReadFromBynaryFile();       
        System.out.println("--------------------------------------------------");
        System.out.println("Write to binary file");
        WriteToBynaryFile(ReadFromBynaryFile());
        System.out.println("--------------------------------------------------");
        System.out.println("Using Try-with-resources, java equivalent of using(...) from JDK7");
        try(BinaryReadFromFile b =new BinaryReadFromFile("C:\\JavaCode\\RefreshingJava\\Fundamentals_01\\src"
                                                       + "\\C10UsingI_O\\ReadTo.txt"))
        {
            System.out.println(b.ReadAll());
        }
        catch(IOException e)
        {
            System.out.println("exception " + e);
        }
        System.out.println("It's not bad that we can have a catch and finnaly block when using Try-with-resources");
        System.out.println("--------------------------------------------------");
        System.out.println("Using the console JDK6+");
//        Console c = System.console();
//        
//        System.out.print("Reading from the conole: ");
//        System.out.println(String.format("Read: %s", c.readLine()));
        System.out.println("IT's an open bug :-):-):-):-)");      
        System.out.println("--------------------------------------------------");
        System.out.println("We can make another better console reader using BufferedReader");
        InputReader cr = new InputReader(System.in);
        System.out.println("Read a String");
        System.out.println("First Read: "+ cr.ReadString());
        System.out.println("Now read an integer");
        System.out.println("Second Read the integer: "+ cr.ReadInt());
        System.out.println("--------------------------------------------------");
        System.out.println("Using FileReader and FileWriter");
        BufferReaderAndBufferWriter();

    }  
    
    private static String ReadFromBynaryFile() 
    {
        String result= "";
        BinaryReadFromFile br=null;
        try
        {
            br= new BinaryReadFromFile("C:\\JavaCode\\RefreshingJava\\Fundamentals_01\\src\\C10UsingI_O\\ReadFrom.txt");
            result = br.ReadAll();
            System.out.println(result);
        }
        catch(IOException e)
        {
            System.out.println("exception " + e);
        }
        finally
        {
            try
            {
                br.close();
            }
            catch(Exception e)
            {
                System.out.println("exception " + e);
            }
        }
        return result;
    }
    
    private static void WriteToBynaryFile(String s) 
    {
        BinaryWriteToFile br=null;
        try
        {
            br= new BinaryWriteToFile("C:\\JavaCode\\RefreshingJava\\Fundamentals_01\\src\\C10UsingI_O\\ReadTo.txt");
            br.WriteAll(s + "\nExtra to destination");
            System.out.println("We had write all!!!");
        }
        catch(IOException e)
        {
            System.out.println("exception " + e);
        }
        finally
        {
            try
            {
                br.close();
            }
            catch(Exception e)
            {
                System.out.println("exception " + e);
            }
        }
    }
    
    private static void BufferReaderAndBufferWriter() throws IOException
    {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\JavaCode\\"
                                                    + "RefreshingJava\\Fundamentals_01\\src\\"
                                                    + "C10UsingI_O\\ReadFrom.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\JavaCode\\"
                                                    + "RefreshingJava\\Fundamentals_01\\src\\"
                                                    + "C10UsingI_O\\BuffereWriteTo.txt"))
            )
        {
            String s;
            while ((s=br.readLine())!=null)
            {
                System.out.println(s);
                bw.write(s + "\n");
            }
        }
    }
}