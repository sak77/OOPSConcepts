package com.saket.oopsconcepts.abstraction;

/**
 *
 * Abstraction is hiding unnecessary details from the client.
 * Java implements abstraction via abstract class or interface.
 *
 * Abstract class contains abstract methods which only convey
 * method signature but hide the unnecessary implementation
 * details from the client.
 *
 * Abstract class is also a useful implementation of inheritance
 * in OOPs. So concept-wise there can be overlaps in some places.
 *
 * Use abstract class when you want to:
 * share code between multiple related classes.
 * sub-classes of abstract class have many common methods/fields.
 *
 * If class implements an interface, but it does not implement all its methods,
 * then that class must also be declared as an abstract class. Any sub-class of such
 * abstract class has to implement remaining interface method and can be said to
 * implement the interface.
 *
 * For example, the Shape abstract class has abstract methods.
 * So for the end user, they only see the method signatures which they can invoke.
 * But they do not have to worry about the implementation details of these methods.
 */
public abstract class Shape implements IShape{

    //getNoOfSides() is abstract, so it hides the implementation details from the user.
    //Its the responsibility of the subclass to provide method body.
    //Note: abstract method cannot be private
    public abstract int getNoOfSides();

    //Notice here that it does not matter if getArea() is already defined in interface
    //As long as this class is abstract, it is okay if it does not implement interface methods here.
    //But the subclass will have to implement methods from abstract class as well as the interface
    //this class implements.

    /*
    In this case subclass of Shape only needs to implement getArea() once. Maybe it satisfies for
    both places, interface and abstract class.

    But again, the user only see the method signature here. The implementation is hidden.
     */
    public abstract int getArea();

    public abstract Color getColor();
}
