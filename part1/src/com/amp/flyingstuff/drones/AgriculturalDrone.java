package com.amp.flyingstuff.drones;

import com.amp.flyingstuff.uav.UAV;

import java.util.Objects;

public class AgriculturalDrone extends UAV {
    private String brand;
    private int carryCapacity;

    /* CONSTRUCTORS */

    public AgriculturalDrone()
    {
        super();
        this.brand = "Unknown";
        this.carryCapacity = 31;
    }

    public AgriculturalDrone(AgriculturalDrone agriculturalDrone)
    {
        super(agriculturalDrone);
        this.brand = agriculturalDrone.brand;
        this.carryCapacity = agriculturalDrone.carryCapacity;
    }

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

    @Override
    public String toString() {
        return super.toString() + " It also is from " + brand + " and can carry " + carryCapacity + ".";
    }

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
