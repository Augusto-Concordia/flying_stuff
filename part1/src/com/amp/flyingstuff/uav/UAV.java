package com.amp.flyingstuff.uav;

public class UAV  {
    protected double price;
    protected double weight;

    /* CONSTRUCTORS */

    public UAV() {
        this(3.14, 314);
    }

    public UAV(UAV uav) {
        this(uav.weight, uav.price);
    }

    public UAV(double weight, double price) {
        this.weight = weight;
        this.price = price;
    }

    /* ACCESSORS & MUTATORS */

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /* OVERRIDES */

    @Override
    public String toString() {
        return "This " + this.getClass().getSimpleName() + " weighs " + weight + " and costs " + price + "$.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UAV uav = (UAV) o;

        if (Double.compare(uav.weight, weight) != 0) return false;
        return Double.compare(uav.price, price) == 0;
    }
}
