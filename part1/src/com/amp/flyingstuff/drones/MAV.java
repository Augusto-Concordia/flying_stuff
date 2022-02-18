package com.amp.flyingstuff.drones;

import com.amp.flyingstuff.uav.UAV;

public class MAV extends UAV {
    private String model;
    private double size;

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
}
