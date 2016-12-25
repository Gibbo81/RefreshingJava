package C10UsingI_O;
import C03ProgramControlStatements.InputReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C10Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        System.out.println("--------------------------------------------------");
//        String s = InputReader.ReadString();
//        System.out.println(s);
        System.out.println("--------------------------------------------------");
        ReadFromBynaryFile();
        ReadFromBynaryFile();
        System.out.println("--------------------------------------------------");

        System.out.println("--------------------------------------------------");
        
        System.out.println("--------------------------------------------------");
        
        System.out.println("--------------------------------------------------");

        System.out.println("--------------------------------------------------");
    }  
    
    private static void ReadFromBynaryFile() 
    {
        BinaryReadFromFile br=null;
        try
        {
            br= new BinaryReadFromFile("C:\\JavaCode\\RefreshingJava\\Fundamentals_01\\src\\C10UsingI_O\\ReadFrom.txt");
            System.out.println(br.ReadAll());
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
}