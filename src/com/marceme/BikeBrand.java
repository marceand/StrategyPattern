package com.marceme;

import com.marceme.interfaces.MoveBehavior;

/**
 * Created by Marcel on 3/3/2016.
 */
public abstract class BikeBrand {

    MoveBehavior mMoveBehavior;
    abstract void displayName();

    public void performMoveBehavior(){
        mMoveBehavior.move();
    }
    public void setMoveBehavior(MoveBehavior moveBehavior){
        mMoveBehavior = moveBehavior;
    }
}
