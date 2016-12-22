package C09HandlingException;

import java.io.IOException;

public class C09Main {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");
        System.out.println("Handling simple exception");
        HandleSimpleException();
        System.out.println("--------------------------------------------------");
        System.out.println("The same exception can be handle by more than one catch block");
        MultiCatchExternal();
        System.out.println("--------------------------------------------------");
        System.out.println("IOException is inside the throws list of method Prompt");
        try
        {
            Prompt();
        }
        catch (IOException e)
        {

        }         
        System.out.println("--------------------------------------------------");
        System.out.println("It's possibloe to catch more exception in onecatch block!");
        HandleMultipleException();
        System.out.println("--------------------------------------------------");
        System.out.println("Personalized Exception with chained exception");
        ThrowPersonalException();
        System.out.println("--------------------------------------------------");
        
        System.out.println("--------------------------------------------------");

        System.out.println("--------------------------------------------------");
        
    }
    
    private static void HandleSimpleException()
    {
        int[] numbers = {8,4,6,4,90,6,96};
        int[] denom = {2,0,3,0,45};
        for (int x=0; x<numbers.length; x++)
        {
            try
            {
                System.out.println(String.format("%s / %s = %s", numbers[x], 
                                                                 denom[x], 
                                                                 numbers[x]/denom[x] ));
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
              System.out.println("Catch ArrayIndexOutOfBoundsException e: " + e );
            }
            catch(ArithmeticException e)
            {
              System.out.println("Catch ArithmeticException e: " + e );
            }
            catch(Throwable e)  //Mather of all exceptions
            {
              System.out.println("Catch generic exception e: " + e );
            }
        }
    }
    
    private static void MultiCatchExternal()
    {
        try
        {
            MultiCatchInternal();
        }
        catch(Throwable e)
        {
            System.out.println("Second and last Catch");
            System.out.println("Catch generic exception e: " + e );
            for (StackTraceElement r : e.getStackTrace())
                System.out.println(r);
        }
    }
    
    private static void MultiCatchInternal()
    {
        try 
        {
            throw new ArithmeticException("Forced Throw");
        }
        catch(ArithmeticException e)
        {
            System.out.println("First Catch");
            System.out.println("Catch ArithmeticException e: " + e );
            //e.printStackTrace();
            for (StackTraceElement r : e.getStackTrace())
                System.out.println(r);
            throw e;
        }
        finally
        {
            System.out.println("This inside the finally is ALWAYS executed!!!!");
        }
    }
    
//    Exceptions that are subclasses of Error or RuntimeException don’t need to be 
//    specified in a throws list. Java simply assumes that a method may throw one.
//    Since java.lang is implicitly imported into all Java programs, most exceptions 
//    derived from RuntimeException are automatically available. Furthermore, they need 
//    not be included in any method’s throws list. In the language of Java, these are 
//    called unchecked exceptions because the compiler does not check to see if a method 
//    handles or throws these exceptions
    private static void Prompt() throws IOException
    {
        throw new IOException("Goes wrong");
    }
    
    private static void HandleMultipleException()
    {
        int[] numbers = {8,4,6,4,90,6,96};
        int[] denom = {2,0,3,0,45};
        for (int x=0; x<numbers.length; x++)
        {
            try
            {
                System.out.println(String.format("%s / %s = %s", numbers[x], 
                                                                 denom[x], 
                                                                 numbers[x]/denom[x] ));
            }
            catch(ArrayIndexOutOfBoundsException | ArithmeticException e)
            {
              System.out.println("Catch Both Exception e: " + e );
            }
        }
    }
    
    private static void ThrowPersonalException()
    {
        try
        {
            throw new NonIntResultException(1,
                                            3,
                                            "external Exception", 
                                            new IOException("InternalException"));
        }
        catch(NonIntResultException e)
        {
            System.out.println(e);
        }
        try
        {
            throw new NonIntResultException(1,3);
        }
        catch(NonIntResultException e)
        {
            System.out.println(e);
        }
    }
}
