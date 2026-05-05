package com.training.org.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {

    private Engine engine;

    public Car() {
        System.out.println("Car Default is called");
    }
    @Autowired
    public Car(Engine engine) {
        System.out.println("Car Parameterised");
        this.engine=engine;
    }

    @Override
    public String toString() {

        return "Car and "+engine.displayEngine();
    }


}
