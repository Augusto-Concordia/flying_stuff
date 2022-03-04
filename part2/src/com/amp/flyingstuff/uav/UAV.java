// -----------------------------------------------------
// Assignment 2 - COMP 249
// Due Date: March 4th
// Question: Part II
// Written by: Augusto Mota Pinheiro (40208080)
//             Michaël Gugliandolo (40213419)
// -----------------------------------------------------

package com.amp.flyingstuff.uav;

import com.amp.flyingstuff.Flying;
import com.amp.flyingstuff.multi.Multirotor;

/**
 * Represents a UAV (Unmanned Aerial Vehicle) with some attributes, and extends from the abstract super-class Flying
 */
public class UAV extends Flying {
    protected double price; //Price of the UAV
    protected double weight; //Weight of the UAV

    /* CONSTRUCTORS */

    /**
     * Default constructor that assigns base values to variables
     */
    public UAV() {
        this(3.14, 314);
    }

    /**
     * Copy constructor that copies the values of the other UAV's attributes
     *
     * @param uav Other UAV to copy values from
     */
    public UAV(UAV uav) {
        this(uav.weight, uav.price);
    }

    /**
     * Parametrized constructor to set given values to the attributes
     *
     * @param weight Weight of the UAV
     * @param price  Price of the UAV
     */
    public UAV(double weight, double price) {
        this.weight = weight;
        this.price = price;
    }

    /* ACCESSORS & MUTATORS */

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /* OVERRIDES */

    /**
     * Copy this object
     * @return New object using its copy constructor to set its attributes
     */
    @Override
    public Flying deepCopy() {
        return new UAV(this);
    }

    /**
     * Generates sentence with the UAV's attributes
     *
     * @return String containing all the attributes
     */
    @Override
    public String toString() {
        return "This " + this.getClass().getSimpleName() + " weighs " + weight + " and costs " + price + "$.";
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

        UAV uav = (UAV) o;

        if (Double.compare(uav.weight, weight) != 0) return false;
        return Double.compare(uav.price, price) == 0;
    }
}