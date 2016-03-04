package com.marceme.implementations;

import com.marceme.interfaces.MoveBehavior;

/**
 * Created by Marcel on 3/3/2016.
 */
public class ThreeWheels implements MoveBehavior {

    @Override
    public void move() {
        System.out.println("Now I am moving with three wheels. I am also a Schwinn bike brand.");
    }
}
