package com.saket.oopsconcepts.inheritance;

/**
 * Abstract class and methods.
 *
 * Abstract class cannot be instantiated, but it can be subclassed.
 *
 * So abstract class is also a useful implementation of inheritance
 * in OOPs. So concept-wise there can be overlaps in some places.
 *
 * Use abstract class when you want to:
 * share code between multiple related classes.
 * sub-classes of abstract class have many common methods/fields.
 *
 * If class implements an interface, but it does not implement all its methods,
 * then that class must also be declared as an abstract class. Any sub-class of such
 * abstract class must implement remaining interface method and can be said to
 * implement the interface.
 *
 * Below AbstractVehicle implements IVehicle interface. And since IVehicle extends
 * IGearBox and IEngine, so indirectly implements from those interfaces as well.
 * But since its abstract, it does not have to implement any methods from IVehicle.
 * instead, it adds its own properties and methods on top of it.
 *
 * Class can implement one or more interface as seen here with Dummy interface.
 */
public abstract class AbstractVehicle implements IVehicle, IDummy {

    private int noOfWheels;
    private int noOfDoors;
    private EngineType vehicleEngineType;
    private int mileage;

    protected enum Gear {
        PARK, DRIVE, REVERSE
    }
    protected Gear currentGear;

    boolean isEngineOn = false;

    //subclass must override abstract methods
    public abstract int getNoOfWheels();

    public abstract int getNoOfDoors();

    public abstract EngineType getVehicleEngineType();

    public abstract int getMileage();

    public void stopEngine(){
        isEngineOn = false;
        currentGear = Gear.PARK;
    }

    //Here we purposely comment out implementation of startEngine()
    //This shows that it is okay for an abstract class to omit some of the
    //methods from the interface it implements.
    //But at the same time, the sub-class of this abstract class must
    //implement startEngine() otherwise it will give compile error.
    /*
    private void startEngine(){
        isEngineOn = true;
        currentGear = Gear.PARK;
    }
*/
}