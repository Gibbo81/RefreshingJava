package C04Classes_ObjectsandMethods;

import C03ProgramControlStatements.*; //import all classes or use --> for a more fine grained C03ProgramControlStatements.InputReader;
import java.io.IOException;

public class Main04 {
    public static void main(String[] args) throws IOException {
        
        Vehicle van = new Vehicle(10, 8, 10);
        System.out.println("Autonomy of van is:" + van.Autonomy());   
        System.out.println("For 15.67 miles we wiil need: " + van.fuelNeeded(15.67) + " gallons");
        
        System.out.println("--------------------------------------------------");
        FinalizeClass use= new FinalizeClass(0);
        for (int y=0; y<300000; y++)
            use.Cicle(y);
        
        System.out.println("--------------------------------------------------");
        InputReader.ReadString();
        
        System.out.println("--------------------------------------------------");
        System.err.println("a class that is declared public must reside in a file by the same name.");
    }
}
