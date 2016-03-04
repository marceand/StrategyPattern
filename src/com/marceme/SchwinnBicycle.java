package com.marceme;

import com.marceme.implementations.TwoWheels;

/**
 * Created by Marcel on 3/3/2016.
 */
public class SchwinnBicycle extends BikeBrand {

    public SchwinnBicycle() {
        mMoveBehavior = new TwoWheels();
    }

    @Override
    void displayName() {
        System.out.println("I am Schwinn bike brand and");
    }
}
