package com.amp.flyingstuff.drones;

import com.amp.flyingstuff.uav.UAV;

public class AgriculturalDrone extends UAV {
    private String brand;
    private int carryCapacity;

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
}
