package C04Classes_ObjectsandMethods;

import C03ProgramControlStatements.InputReader;

public class Main04 {
    public static void main(String[] args) {
        
        Vehicle van = new Vehicle(10, 8, 10);
        System.out.println("Autonomy of van is:" + van.Autonomy());
        
        System.out.println("For 15.67 miles we wiil need: " + van.fuelNeeded(15.67) + " gallons");
        
        
        
        
        
        
    }
}
