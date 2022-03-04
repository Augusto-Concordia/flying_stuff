// -----------------------------------------------------
// Assignment 2 - COMP 249
// Due Date: March 4th
// Question: Part II
// Written by: Augusto Mota Pinheiro (40208080)
//             Michaël Gugliandolo (40213419)
// -----------------------------------------------------

package com.amp.flyingstuff.drones;

import com.amp.flyingstuff.Flying;
import com.amp.flyingstuff.uav.UAV;

import java.util.Objects;

/**
 * Represents a MAV (Micro Air Vehicle) with some attributes, and extends from UAV
 */
public class MAV extends UAV {
    private String model; //Model of the MAV
    private double size; //Size of the MAV

    /* CONSTRUCTORS */

    /**
     * Default constructor that assigns base values to variables
     */
    public MAV() {
        super();
        this.model = "Unknown";
        this.size = 3.14;
    }

    /**
     * Copy constructor that copies the values of the other MAV's attributes
     *
     * @param mav Other MAV to copy values from
     */
    public MAV(MAV mav) {
        super(mav);
        this.model = mav.model;
        this.size = mav.size;
    }

    /**
     * Parametrized constructor to set given values to the attributes
     *
     * @param weight Weight of the MAV
     * @param price  Price of the MAV
     * @param model  Model of the MAV
     * @param size   Size of the MAV
     */
    public MAV(double weight, double price, String model, double size) {
        super(weight, price);
        this.model = model;
        this.size = size;
    }

    /* ACCESSORS & MUTATORS */

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    /* OVERRIDES */

    /**
     * Copy this object
     * @return New object using its copy constructor to set its attributes
     */
    @Override
    public Flying deepCopy() {
        return new MAV(this);
    }

    /**
     * Generates sentence with the MAV's attributes
     *
     * @return String containing all the attributes
     */
    @Override
    public String toString() {
        return super.toString() + " Its model is " + model + " and measures " + size + ".";
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

        MAV mav = (MAV) o;

        if (Double.compare(mav.size, size) != 0) return false;
        return Objects.equals(model, mav.model);
    }
}
