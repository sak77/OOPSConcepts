package com.saket.oopsconcepts.inheritance;

/**
 * This is example of class that extends a non-abstract class.
 *
 * Here the subclass is not required to implement any method from the superclass.
 *
 * Also note that a class can only extend from a single superclass. Not more than that.
 * Otherwise i get an error - class cannot extend multiple classes.
 */
public class VolvoCar extends Car {

    private enum  ModelNo {
        XC40, XC60, XC90, PS, V40, V60, V90, S90
    }

    private ModelNo modelNo;

    public ModelNo getModelNo() {
        return modelNo;
    }

    public void setModelNo(ModelNo modelNo) {
        this.modelNo = modelNo;
    }

    /*
    using super.getVehicleEngineType() calls the super class implementation of the method.
     */
    @Override
    public EngineType getVehicleEngineType() {
        return super.getVehicleEngineType();
    }

    @Override
    public int getNoOfDoors() {
        //return super.getNoOfDoors();
        switch (modelNo) {
            case PS: return 2;
            case S90: return 4;
            default: return 4;
        }
    }
}
