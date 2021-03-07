package com.saket.oopsconcepts.abstraction;

/**
 * Abstraction means hiding unnecessary details and showing only
 * required info to the user.
 * <p>
 * In Java, abstraction can be achieved via abstract classes and interface.
 * <p>
 * Abstract class cannot be instantiated, it can only be subclassed.
 * It can have regular methods with definition. But it can also have abstract methods.
 * Abstract methods only provide the signature of the methods. The method
 * body is defined by the subclass.
 * <p>
 * So in this way abtract class can use abstract methods to hide the implementation
 * details from the client.
 */
public class Triangle extends Shape {
    @Override
    public int getNoOfSides() {
        return 3;
    }

    @Override
    public int getArea() {
        return 100;
    }

    @Override
    public Color getColor() {
        return Color.RED;
    }

    public boolean isRightAngledTriangle() {
        return false;
    }

}
