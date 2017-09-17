package C07Inheritance;

import C04Classes_ObjectsandMethods.Vehicle; //remeber you can import only single class

public class Truck extends Vehicle  {
    private int _capacity;
    
    public Truck(int pass, int fuel, int mfg, int capacity) {
        super(pass, fuel, mfg);
        _capacity = capacity;
    }   

    public int getCapacity() {
        return _capacity;
    }

    public void setCapacity(int _capacity) {
        this._capacity = _capacity;
    }
}
