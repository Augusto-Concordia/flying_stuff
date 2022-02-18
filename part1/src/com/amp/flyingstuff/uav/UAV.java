package com.amp.flyingstuff.uav;

public class UAV {
    protected double weight;
    protected double price;

    public UAV()
    {
        this(3.14, 314);
    }

    public UAV(UAV uav)
    {
        this(uav.weight, uav.price);
    }

    public UAV(double weight, double price) {
        this.weight = weight;
        this.price = price;
    }
}
