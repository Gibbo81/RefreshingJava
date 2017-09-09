package C12Enumerations_Autoboxing_StaticImport_Annotations;

 enum Transport {
    car, truck, airplane, train, ship
}

//Unlike the way enumerations are implemented in some other languages, Java implements enumerations 
//as class types. You can give it constructors, add instance variables and methods
//and even implement interfaces.
 enum TransportWithSpeed  {
     //this is similar to a costructor cal
    car(90), truck(70), airplane(500), train(100), ship(60);    
    //We nee to respect thecostructor's signature.
    private int _speed;
    
    int GetSpeed()
    {
        return _speed;
    }
    
    TransportWithSpeed (int speed)
    {
        _speed = speed;
    }
        
    @Override 
    public String toString()
    {
        return String.format("%s has a basic speed of %s", super.toString(), GetSpeed());
    }
}