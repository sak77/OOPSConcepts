package com.saket.oopsconcepts.abstraction;

/*
To see notes on Abstraction refer Shape,java and IShape.Java first.

Circle extends Shape but does not implement IShape directly.
However, since Shape implements IShape so Circle indirectly also
implements IShape interface.
 */
public class Circle extends Shape {
    @Override
    public int getNoOfSides() {
        return 0;
    }

    @Override
    public int getArea() {
        return 200;
    }

    @Override
    public Color getColor() {
        return Color.PINK;
    }
}
