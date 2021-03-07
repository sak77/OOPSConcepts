package com.saket.oopsconcepts.inheritance;


/**
 * Here Car class extends Vehicle class.
 * <p>
 * A class can extend another class or an abstract class. But it can only extend
 * one other class. It cannot extend more than one class. But it can implement more than one
 * interface. This way Java does not support multiple inheritance but using interfaces, there
 * can still be some type of multiple inheritance.
 * <p>
 * subclass does NOT have access to private members of the super class. Only public and
 * protected members.
 * <p>
 * Only difference is, if abstract class has abstract methods, then the subclass
 * must implement them.
 */
public class Car extends Vehicle {

    @Override
    public int getNoOfWheels() {
        return 4;
    }

    @Override
    public int getNoOfDoors() {
        return 4;
    }

    @Override
    public Vehicle.EngineType getVehicleEngineType() {
        return EngineType.HYBRID;
    }

    @Override
    public int getMileage() {
        return 200;
    }

    public void drive() {
        if (isEngineOn) {
            if (currentGear != Gear.DRIVE) {
                //Move to Drive gear
                currentGear = Gear.DRIVE;
            }
            //Press accelerator
            System.out.println("Press accelerator");
            System.out.println("Driving..");
        } else {
            System.out.println("Start engine first");
            //startEngine();
            drive();
        }
    }

    @Override
    public void startEngine() {
        isEngineOn = true;
        currentGear = Gear.PARK;
    }

    //Car can have its own methods as well..
    public boolean isInsured() {
        return true;
    }
}
