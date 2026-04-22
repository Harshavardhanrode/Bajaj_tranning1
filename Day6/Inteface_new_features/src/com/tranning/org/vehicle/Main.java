package com.tranning.org.vehicle;

interface Vehicle {
    default  void start(){
        System.out.println("vechile is starting");
    }
}
class Car implements  Vehicle{

}

public class Main {
    public static void main(String[] args) {
    Car c = new Car();
    c.start();

    }
}