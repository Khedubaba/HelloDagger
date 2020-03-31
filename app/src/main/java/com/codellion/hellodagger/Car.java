package com.codellion.hellodagger;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    private Engine mEngine;
    private Wheels mWheels;

    @Inject
    public Car(Engine engine, Wheels wheels) {
        mEngine = engine;
        mWheels = wheels;
    }

    public void drive(){
        Log.d(TAG, "driving...");
    }

}
