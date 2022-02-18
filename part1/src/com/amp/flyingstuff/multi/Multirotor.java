package com.amp.flyingstuff.multi;

import com.amp.flyingstuff.copters.Helicopter;

public class Multirotor extends Helicopter {
    private int numberOfRotors;

    public Multirotor()
    {
        super();
        this.numberOfRotors = 5;
    }

    public Multirotor(Multirotor multirotor)
    {
        super(multirotor);
        this.numberOfRotors = multirotor.numberOfRotors;
    }

    public Multirotor(String brand, double price, int horsepower, int numberOfCylinders, int creationYear, int passengerCapacity, int numberOfRotors) {
        super(brand, price, horsepower, numberOfCylinders, creationYear, passengerCapacity);
        this.numberOfRotors = numberOfRotors;
    }
}
