// -----------------------------------------------------
// Assignment 2 - COMP 249
// Due Date: March 4th
// Question: Part I
// Written by: Augusto Mota Pinheiro (40208080)
//             Michaël Gugliandolo (40213419)
// -----------------------------------------------------

package com.amp.flyingstuff.copters;

/**
 * Represents a quadcopter with some attributes, and extends from Helicopter
 */
public class Quadcopter extends Helicopter {
    private int maxFlyingSpeed; //Maximum flying speed of the quadcopter

    /* CONSTRUCTORS */

    /**
     * Default constructor that assigns base values to variables
     */
    public Quadcopter() {
        super();
        this.maxFlyingSpeed = 95;
    }

    /**
     * Copy constructor that copies the values of the other quadcopter's attributes
     *
     * @param quadcopter Other quadcopter to copy values from
     */
    public Quadcopter(Quadcopter quadcopter) {
        super(quadcopter);
        this.maxFlyingSpeed = quadcopter.maxFlyingSpeed;
    }

    /**
     * Parametrized constructor to set given values to the attributes
     *
     * @param brand             Brand of the quadcopter
     * @param price             Price of the quadcopter
     * @param horsepower        Horsepower of the quadcopter
     * @param numberOfCylinders Number of cylinders of the quadcopter
     * @param creationYear      Creation year of the quadcopter
     * @param passengerCapacity Passenger capacity of the quadcopter
     * @param maxFlyingSpeed    Maximum flying speed of the quadcopter
     */
    public Quadcopter(String brand, double price, int horsepower, int numberOfCylinders, int creationYear, int passengerCapacity, int maxFlyingSpeed) {
        super(brand, price, horsepower, numberOfCylinders, creationYear, passengerCapacity);
        this.maxFlyingSpeed = maxFlyingSpeed;
    }

    /* ACCESSORS & MUTATORS */

    public int getMaxFlyingSpeed() {
        return maxFlyingSpeed;
    }

    public void setMaxFlyingSpeed(int maxFlyingSpeed) {
        this.maxFlyingSpeed = maxFlyingSpeed;
    }

    /* OVERRIDES */

    /**
     * Generates sentence with the quadcopter's attributes
     *
     * @return String containing all the attributes
     */
    @Override
    public String toString() {
        return super.toString() + " Finally, its max flying speed is " + maxFlyingSpeed + ".";
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

        Quadcopter that = (Quadcopter) o;

        return maxFlyingSpeed == that.maxFlyingSpeed;
    }
}
