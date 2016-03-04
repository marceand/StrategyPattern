package com.marceme.implementations;

import com.marceme.interfaces.MoveBehavior;

/**
 * Created by Marcel on 3/3/2016.
 */
public class TwoWheels implements MoveBehavior{
    @Override
    public void move() {
        System.out.println("I am moving with two wheels.");
    }
}
