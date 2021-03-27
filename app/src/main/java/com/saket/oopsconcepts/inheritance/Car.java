package com.saket.oopsconcepts.inheritance;


import java.util.Objects;

/**
 * Here Car class extends AbstractVehicle class.
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
public class Car extends AbstractVehicle {

    private String modelName;

    @Override
    public int getNoOfWheels() {
        return 4;
    }

    @Override
    public int getNoOfDoors() {
        return 4;
    }

    @Override
    public AbstractVehicle.EngineType getVehicleEngineType() {
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
            startEngine();
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

    @Override
    public GEARBOX_TYPE getGearBoxType() {
        //Our car has automatice transmission
        return GEARBOX_TYPE.AUTOMATIC;
    }

    @Override
    public GEARBOX_PLACEMENT getGearBoxPlacement() {
        //Our car has paddle-shift
        return GEARBOX_PLACEMENT.PADDLE_SHIFT;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(modelName, car.modelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName);
    }
}
