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

public class Airplane extends Flying {
    protected String brand;
    protected double price;
    protected int horsepower;

    /* CONSTRUCTORS */

    public Airplane() {
        this("Unknown", 3.14, 3);
    }

    public Airplane(Airplane airplane)
    {
        this(airplane.brand, airplane.price, airplane.horsepower);
    }

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

    @Override
    public String toString() {
        return "This " + this.getClass().getSimpleName() + " is from " + brand + ", costs " + price + "$ and has " + horsepower + "hp.";
    }

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
