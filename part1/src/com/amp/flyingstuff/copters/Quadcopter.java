package com.amp.flyingstuff.copters;

public class Quadcopter extends Helicopter {
    private int maxFlyingSpeed;

    public Quadcopter() {
        super();
        this.maxFlyingSpeed = 95;
    }

    public Quadcopter(Quadcopter quadcopter) {
        super(quadcopter);
        this.maxFlyingSpeed = quadcopter.maxFlyingSpeed;
    }

    public Quadcopter(String brand, double price, int horsepower, int numberOfCylinders, int creationYear, int passengerCapacity, int maxFlyingSpeed) {
        super(brand, price, horsepower, numberOfCylinders, creationYear, passengerCapacity);
        this.maxFlyingSpeed = maxFlyingSpeed;
    }
}
