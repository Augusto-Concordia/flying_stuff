package com.amp.flyingstuff.copters;

import com.amp.flyingstuff.airplane.Airplane;

public class Helicopter extends Airplane {
    protected int numberOfCylinders;
    protected int creationYear;
    protected int passengerCapacity;

    public Helicopter()
    {
        super();
        this.numberOfCylinders = 4;
        this.creationYear = 2022;
        this.passengerCapacity = 2;
    }

    public Helicopter(Helicopter helicopter)
    {
        super(helicopter);

        this.numberOfCylinders = helicopter.numberOfCylinders;
        this.creationYear = helicopter.creationYear;
        this.passengerCapacity = helicopter.passengerCapacity;
    }

    public Helicopter(String brand, double price, int horsepower, int numberOfCylinders, int creationYear, int passengerCapacity) {
        super(brand, price, horsepower);

        this.numberOfCylinders = numberOfCylinders;
        this.creationYear = creationYear;
        this.passengerCapacity = passengerCapacity;
    }
}
