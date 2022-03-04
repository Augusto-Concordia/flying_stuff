// -----------------------------------------------------
// Assignment 2 - COMP 249
// Due Date: March 4th
// Question: Part I
// Written by: Augusto Mota Pinheiro (40208080)
//             Michaël Gugliandolo (40213419)
// -----------------------------------------------------

package com.amp.flyingstuff.copters;

import com.amp.flyingstuff.airplane.Airplane;

/**
 * Represents a helicopter with some attributes, and extends from Airplane
 */
public class Helicopter extends Airplane {
    protected int numberOfCylinders; //Number of cylinders of helicopter
    protected int creationYear; //Creation year of helicopter
    protected int passengerCapacity; //Number of passengers that can fit in the helicopter

    /* CONSTRUCTORS */

    /**
     * Default constructor that assigns base values to variables
     */
    public Helicopter() {
        super();
        this.numberOfCylinders = 4;
        this.creationYear = 2022;
        this.passengerCapacity = 2;
    }

    /**
     * Copy constructor that copies the values of the other helicopter's attributes
     *
     * @param helicopter Other helicopter to copy values from
     */
    public Helicopter(Helicopter helicopter) {
        super(helicopter);

        this.numberOfCylinders = helicopter.numberOfCylinders;
        this.creationYear = helicopter.creationYear;
        this.passengerCapacity = helicopter.passengerCapacity;
    }

    /**
     * Parametrized constructor to set given values to the attributes
     *
     * @param brand             Brand of the helicopter
     * @param price             Price of the helicopter
     * @param horsepower        Horsepower of the helicopter
     * @param numberOfCylinders Number of cylinders of the helicopter
     * @param creationYear      Creation year of the helicopter
     * @param passengerCapacity Passenger capacity of the helicopter
     */
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

    /**
     * Generates sentence with the helicopter's attributes
     *
     * @return String containing all the attributes
     */
    @Override
    public String toString() {
        return super.toString() + " It also has " + numberOfCylinders + " cylinders, was created in " + creationYear + " and has a maximum human capacity of " + passengerCapacity + " people.";
    }

    /**
     * Checks if this object equals another object by comparing class and attributes
     *
     * @param o Other object to compare
     * @return True if both objects are equal, false if not
     */
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
