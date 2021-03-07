package com.saket.oopsconcepts.abstraction;

/**
 * Interface is a contract between 2 or more classes to define what methods they will implement.
 *
 * It provides abstraction in the sense that it does not actually contain the method body.
 * Except for maybe default methods.
 *
 * IShape is an interface which has 2 methods and one default method. So from perspective of
 * abstraction, looking at this the client knows what methods are provided in this interface.
 * But it does not see the actual implementation here, since it is in the implementing class.
 */
public interface IShape {
    enum Color {
        RED, BLUE, GREEN, YELLOW, ORANGE, PINK
    }

    int getArea();

    Color getColor();

    //A default method just to show interface default methods can have their own body.
    default boolean isVisible() {
        return true;
    }
}
