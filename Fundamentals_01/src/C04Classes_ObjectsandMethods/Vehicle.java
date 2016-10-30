package C04Classes_ObjectsandMethods;

public class Vehicle {
    private int passengers;
    private int fuelcapacity;
    private int milesforgallon;
    
    public Vehicle(int pass, int fuel, int mfg )
    {
        passengers = pass;
        fuelcapacity = fuel;
        milesforgallon = mfg;
    }
    
    public int Autonomy()
    {
        return fuelcapacity * milesforgallon;
    }
}
