// -----------------------------------------------------
// Assignment 2 - COMP 249
// Due Date: March 4th
// Question: Part I
// Written by: Augusto Mota Pinheiro (40208080)
//             Michaël Gugliandolo (40213419)
// -----------------------------------------------------

package com.amp.flyingstuff.multi;

import com.amp.flyingstuff.copters.Helicopter;

/**
 * Represents a multirotor with some attributes, and extends from Helicopter
 */
public class Multirotor extends Helicopter {
    private int numberOfRotors; //Number of rotors of the multirotor

    /* CONSTRUCTORS */

    /**
     * Default constructor that assigns base values to variables
     */
    public Multirotor() {
        super();
        this.numberOfRotors = 5;
    }

    /**
     * Copy constructor that copies the values of the other multirotor's attributes
     *
     * @param multirotor Other multirotor to copy values from
     */
    public Multirotor(Multirotor multirotor) {
        super(multirotor);
        this.numberOfRotors = multirotor.numberOfRotors;
    }

    /**
     * Parametrized constructor to set given values to the attributes
     *
     * @param brand             Brand of the multirotor
     * @param price             Price of the multirotor
     * @param horsepower        Horsepower of the multirotor
     * @param numberOfCylinders Number of cylinders of the multirotor
     * @param creationYear      Creation year of the multirotor
     * @param passengerCapacity Passenger capacity of the multirotor
     * @param numberOfRotors    Number of rotors of the multirotor
     */
    public Multirotor(String brand, double price, int horsepower, int numberOfCylinders, int creationYear, int passengerCapacity, int numberOfRotors) {
        super(brand, price, horsepower, numberOfCylinders, creationYear, passengerCapacity);
        this.numberOfRotors = numberOfRotors;
    }

    /* ACCESSORS & MUTATORS */

    public int getNumberOfRotors() {
        return numberOfRotors;
    }

    public void setNumberOfRotors(int numberOfRotors) {
        this.numberOfRotors = numberOfRotors;
    }

    /* OVERRIDES */

    /**
     * Generates sentence with the multirotor's attributes
     *
     * @return String containing all the attributes
     */
    @Override
    public String toString() {
        return super.toString() + " Finally, it has " + numberOfRotors + " rotors.";
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

        Multirotor multirotor = (Multirotor) o;

        return numberOfRotors == multirotor.numberOfRotors;
    }
}
