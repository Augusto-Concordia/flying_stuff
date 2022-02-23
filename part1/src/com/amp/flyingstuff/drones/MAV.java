// -----------------------------------------------------
// Assignment 2 - COMP 249
// Due Date: March 4th
// Question: Part I
// Written by: Augusto Mota Pinheiro (40208080)
//             Michaël Gugliandolo (40213419)
// -----------------------------------------------------

package com.amp.flyingstuff.drones;

import com.amp.flyingstuff.uav.UAV;

import java.util.Objects;

public class MAV extends UAV {
    private String model;
    private double size;

    /* CONSTRUCTORS */

    public MAV()
    {
        super();
        this.model = "Unknown";
        this.size = 3.14;
    }

    public MAV(MAV mav)
    {
        super(mav);
        this.model = mav.model;
        this.size = mav.size;
    }

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

    @Override
    public String toString() {
        return super.toString() + " Its model is " + model + " and measures " + size + ".";
    }

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
