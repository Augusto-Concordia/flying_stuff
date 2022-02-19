package com.amp.flyingstuff.copters;

import com.amp.flyingstuff.airplane.Airplane;

public class Helicopter extends Airplane {
    protected int numberOfCylinders;
    protected int creationYear;
    protected int passengerCapacity;

    /* CONSTRUCTORS */

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

    /* ACCESSORS & MUTATORS */

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    /* OVERRIDES */

    @Override
    public String toString() {
        return super.toString() + " It also has " + numberOfCylinders + " cylinders, was created in " + creationYear + " and has a maximum human capacity of " + passengerCapacity + " people.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Helicopter helicopter = (Helicopter) o;

        if (numberOfCylinders != helicopter.numberOfCylinders) return false;
        if (creationYear != helicopter.creationYear) return false;
        return passengerCapacity == helicopter.passengerCapacity;
    }
}
