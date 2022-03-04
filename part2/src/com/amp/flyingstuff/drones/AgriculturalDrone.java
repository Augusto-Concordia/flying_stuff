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
 * Represents an agricultural drone with some attributes, and extends from UAV
 */
public class AgriculturalDrone extends UAV {
    private String brand; //Brand of the agricultural drone
    private int carryCapacity; //Carry capacity of the agricultural drone

    /* CONSTRUCTORS */

    /**
     * Default constructor that assigns base values to variables
     */
    public AgriculturalDrone() {
        super();
        this.brand = "Unknown";
        this.carryCapacity = 31;
    }

    /**
     * Copy constructor that copies the values of the other agricultural drone's attributes
     *
     * @param agriculturalDrone Other agricultural drone to copy values from
     */
    public AgriculturalDrone(AgriculturalDrone agriculturalDrone) {
        super(agriculturalDrone);
        this.brand = agriculturalDrone.brand;
        this.carryCapacity = agriculturalDrone.carryCapacity;
    }

    /**
     * Parametrized constructor to set given values to the attributes
     *
     * @param weight        Weight of the agricultural drone
     * @param price         Price of the agricultural drone
     * @param brand         Brand of the agricultural drone
     * @param carryCapacity Carry capacity of the agricultural drone
     */
    public AgriculturalDrone(double weight, double price, String brand, int carryCapacity) {
        super(weight, price);
        this.brand = brand;
        this.carryCapacity = carryCapacity;
    }

    /* ACCESSORS & MUTATORS */

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCarryCapacity() {
        return carryCapacity;
    }

    public void setCarryCapacity(int carryCapacity) {
        this.carryCapacity = carryCapacity;
    }

    /* OVERRIDES */

    /**
     * Copy this object
     * @return New object using its copy constructor to set its attributes
     */
    @Override
    public Flying deepCopy() {
        return new AgriculturalDrone(this);
    }

    /**
     * Generates sentence with the agricultural drone's attributes
     *
     * @return String containing all the attributes
     */
    @Override
    public String toString() {
        return super.toString() + " It also is from " + brand + " and can carry " + carryCapacity + ".";
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

        AgriculturalDrone that = (AgriculturalDrone) o;

        if (carryCapacity != that.carryCapacity) return false;
        return Objects.equals(brand, that.brand);
    }
}
