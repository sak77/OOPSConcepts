package com.saket.oopsconcepts.inheritance;

/**
 * An interface is a contract between 2 or more classes that determines what methods
 * they will implement.
 *
 * In terms of inheritance, following is observed -
 * interface can extend from one or more other interfaces.
 * Interface cannot extend from class.
 * Interface cannot implement another interface.
 *
 * In below case IVehicle extends from IEngine and IGearbox as well.
 * So it inherits their methods/properties. And it adds its own methods as well.
 * Any implementing class has to implement methods of all 3 interfaces in this case.
 */
public interface IVehicle extends IEngine, IGearbox {
        /*
    Interface members are treated as static final members. Hence you cannot have
    instance variables inside an interface.

    Generally speaking, interface should contain methods, an interface with only member
    variables is considered an ANTI-PATTERN.

    Refer this link for more details-
    https://stackoverflow.com/questions/7311274/attributes-member-variables-in-interfaces
     */

    //isEngineOn is treated as final static boolean isEngineOn. Which is not what i expected.
    //boolean isEngineOn = false;

    void drive();
}
