package com.amp.flyingstuff.airplane;

public class Airplane {
    protected String brand;
    protected double price;
    protected int horsepower;

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
}
