package com.marceme;

import com.marceme.implementations.TwoWheels;

/**
 * Created by Marcel on 3/3/2016.
 */
public class ModelBicycle extends BikeBrand {

    public ModelBicycle() {
        mMoveBehavior = new TwoWheels();
    }

    @Override
    void displayName() {
        System.out.println("This is a model and");
    }
}
