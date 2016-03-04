package com.marceme;

import com.marceme.implementations.ThreeWheels;

/**
 * Created by Marcel on 3/3/2016.
 */
public class Main {

    public static void main(String[] args) {
	// write your code here

        // Strategy Design Pattern Example
        // Follows the same Strategy structure in the book
        BikeBrand bike = new SchwinnBicycle();
        bike.displayName();
        bike.performMoveBehavior();

        // Leave a space
        System.out.println("");
        // Change behavior at run time
        BikeBrand modelBike = new ModelBicycle();
        modelBike.displayName();
        modelBike.performMoveBehavior();
        modelBike.setMoveBehavior(new ThreeWheels());
        modelBike.performMoveBehavior();

        /* Output:
        I am Schwinn bike brand and
        I am moving with two wheels.

        This is a model and
        I am moving with two wheels.
        Now I am moving with three wheels. I am also a Schwinn bike brand.
                */
    }
}
