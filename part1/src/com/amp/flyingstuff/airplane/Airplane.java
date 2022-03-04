// -----------------------------------------------------
// Assignment 2 - COMP 249
// Due Date: March 4th
// Question: Part I
// Written by: Augusto Mota Pinheiro (40208080)
//             Michaël Gugliandolo (40213419)
// -----------------------------------------------------

package com.amp.flyingstuff.airplane;

import com.amp.flyingstuff.Flying;

import java.util.Objects;

/**
 * Represents an airplane with some attributes, and extends from the abstract super-class Flying
 */
public class Airplane extends Flying {
    protected String brand; //Brand of the airplane
    protected double price; //Price of the airplane
    protected int horsepower; //Horsepower of the airplane

    /* CONSTRUCTORS */

    /**
     * Default constructor that assigns base values to variables
     */
    public Airplane() {
        this("Unknown", 3.14, 3);
    }

    /**
     * Copy constructor that copies the values of the other airplane's attributes
     *
     * @param airplane Other airplane to copy values from
     */
    public Airplane(Airplane airplane) {
        this(airplane.brand, airplane.price, airplane.horsepower);
    }

    /**
     * Parametrized constructor to set given values to the attributes
     *
     * @param brand      Brand of the airplane
     * @param price      Price of the airplane
     * @param horsepower Horsepower of the airplane
     */
    public Airplane(String brand, double price, int horsepower) {
        this.brand = brand;
        this.price = price;
        this.horsepower = horsepower;
    }

    /* ACCESSORS & MUTATORS */

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    /* OVERRIDES */

    /**
     * Generates sentence with the airplane's attributes
     *
     * @return String containing all the attributes
     */
    @Override
    public String toString() {
        return "This " + this.getClass().getSimpleName() + " is from " + brand + ", costs " + price + "$ and has " + horsepower + "hp.";
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

        Airplane airplane = (Airplane) o;

        if (Double.compare(airplane.price, price) != 0) return false;
        if (horsepower != airplane.horsepower) return false;
        return Objects.equals(brand, airplane.brand);
    }
}
