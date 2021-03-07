package com.saket.oopsconcepts.encapsulation;

/**
 * Encapsulation means binding data and methods into a single unit (class) and
 * also controlling the access to the data in the class via methods with
 * access modifiers.
 * <p>
 * Encapsulation vs abstraction - Like mentioned above, encapsulation deals with
 * binding related data in a single unit and controlling access to this data via
 * methods with respective access modifiers.
 * <p>
 * Abstraction on the other hand deals with hiding unnecessary details from the
 * client via abstract methods or interfaces.
 * <p>
 * While encapsulation operates at class level, abstraction operates at a higher level,
 * which means it already includes concepts covered in encapsulation (class, methods, access modifiers)
 * and on top of that it hides method body from the user.
 * <p>
 * Below we have a fruit class which contains data related to fruits and also
 * it controls acess to this data via methods and access modifiers.
 */
public class Fruit {

    /*
So here hide direct access to color, taste size by marking them as private.
 */
    private int color;
    private int taste;
    private Size size;

    /*
    Instead we use public getter and setter methods to manages access to the private members.
     */
    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getTaste() {
        return taste;
    }

    public void setTaste(int taste) {
        this.taste = taste;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    /*
    Protected members are accessible to subclasses of Fruit.
     */

    /*
    Playing around with enums.
     */
    public enum Size {
        LARGE, MEDIUM, SMALL;

        int id;

        static {
            LARGE.id = 1;
            MEDIUM.id = 2;
            SMALL.id = 3;
        }

        public int getId() {
            return id;
        }

        public int getWeight(int id) {
            switch (id) {
                case 1:
                    return 4;
                case 2:
                    return 3;
                case 3:
                    return 5;
            }
            return -1;
        }

        public int getHeight(int id) {
            switch (id) {
                case 1:
                    return 10;
                case 2:
                    return 12;
                case 3:
                    return 9;
            }
            return -1;
        }

    }
}
