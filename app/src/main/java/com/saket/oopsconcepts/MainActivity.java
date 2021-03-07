package com.saket.oopsconcepts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.saket.oopsconcepts.abstraction.Circle;
import com.saket.oopsconcepts.abstraction.Square;
import com.saket.oopsconcepts.abstraction.Triangle;
import com.saket.oopsconcepts.abstraction.Shape;
import com.saket.oopsconcepts.encapsulation.Fruit;
import com.saket.oopsconcepts.inheritance.Car;
import com.saket.oopsconcepts.inheritance.Vehicle;
import com.saket.oopsconcepts.inheritance.VolvoCar;

/**
 * 4 fundamental OOPS concepts - Abstraction, Encapsulation, Inheritance and Polymorphism.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //testAbstraction();
        testEncapsulation();
    }

    private void testAbstraction() {
        //Abstract class cannot be instantiated. So we use instance of subclass.
        Shape triangle = new Triangle();

        Shape circle = new Circle();

        //Since square implements IShape but not Shape, so we cannot create instance of Shape using Square
        Square square = new Square();

        //The end user only calls getNoOfSides(). But does not see implementation in Shape class.
        //Here it picks implementation from Triangle class, so it will return a 3.
        System.out.println("No of sides in a triangle: " + triangle.getNoOfSides());
        System.out.println("No of sides in a circle: " + circle.getNoOfSides());
        System.out.println("No of sides in a square: " + square.getNoOfSides());
    }

    private void testInheritance() {
        //Since abstract class cannot be instantiated
        // we create instance of superclass vehicle using its subclass Car.
        Vehicle myCar = new Car();
        //So a super class can be instantiated using instance of its subclass
        //But reverse is not true, so although VolvoCar extends Car,
        //we cannot create instance of VolvoCar from Car instance.
        //VolvoCar volvoCar = new Car();
        VolvoCar volvoCar = new VolvoCar();

        //However, in such a scenario the super class can only invoke its own methods,
        // and not methods of the sub-class.....
        //So myCar can invoke methods defined in Vehicle class where actual
        //implementation comes from Car instance.
        //so getNoOfDoors will return 4.
        System.out.println("Car doors - " + myCar.getNoOfDoors());

        //But myCar cannot invoke isInsured() which is defined only in subclass Car.
        //Below line gives error cannot resolve isInsured() in Vehicle.
        //myCar.isInsured();
        
        Car testCar = new Car();
        testCar.isInsured();

    }

    private void testEncapsulation() {
        Fruit fruit = new Fruit();

        fruit.setSize(Fruit.Size.LARGE);

        Fruit.Size size = fruit.getSize();

        System.out.println("Fruit weight is " + size.getWeight(size.getId()));
        System.out.println("Fruit height is " + size.getHeight(size.getId()));
    }
}