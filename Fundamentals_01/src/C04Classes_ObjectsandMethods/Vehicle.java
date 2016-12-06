package C04Classes_ObjectsandMethods;

public class Vehicle {
    protected int passengers;
    protected int fuelcapacity;
    protected int milesforgallon;
    
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
    
    public double fuelNeeded(double miles)
    {
        return miles/milesforgallon;
    }
}
