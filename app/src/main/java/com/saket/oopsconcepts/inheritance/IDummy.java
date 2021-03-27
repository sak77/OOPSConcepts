package com.saket.oopsconcepts.inheritance;

/**
 * Dummy interface to show that class can implement more than one interfaces.
 *
 * 2 interfaces have the same method with same signature with a common sub-class-
 *
 * In this case it is observed the subclass can implement the common method, but
 * the interface the method comes from depends on the sequence of interfaces implemented.
 *
 * So in this case if IDummy is implemented before IVehicle, then drive() will
 * be derived from IDummy. Else it will be derived from IVehicle.
 *
 */
public interface IDummy {

    void drive();
}
