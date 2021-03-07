package com.saket.oopsconcepts.abstraction;

/*
To see notes on Abstraction refer Shape,java and IShape.Java first.

Square implements IShape but does not extend Shape class...
 */
public class Square implements IShape {
    @Override
    public int getArea() {
        return 25;
    }

    @Override
    public Color getColor() {
        return Color.BLUE;
    }

    public int getNoOfSides() { return 4;}
}
