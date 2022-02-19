package com.amp.flyingstuff.copters;

public class Quadcopter extends Helicopter {
    private int maxFlyingSpeed;

    /* CONSTRUCTORS */

    public Quadcopter() {
        super();
        this.maxFlyingSpeed = 95;
    }

    public Quadcopter(Quadcopter quadcopter) {
        super(quadcopter);
        this.maxFlyingSpeed = quadcopter.maxFlyingSpeed;
    }

    public Quadcopter(String brand, double price, int horsepower, int numberOfCylinders, int creationYear, int passengerCapacity, int maxFlyingSpeed) {
        super(brand, price, horsepower, numberOfCylinders, creationYear, passengerCapacity);
        this.maxFlyingSpeed = maxFlyingSpeed;
    }

    /* ACCESSORS & MUTATORS */

    public int getMaxFlyingSpeed() {
        return maxFlyingSpeed;
    }

    public void setMaxFlyingSpeed(int maxFlyingSpeed) {
        this.maxFlyingSpeed = maxFlyingSpeed;
    }

    /* OVERRIDES */

    @Override
    public String toString() {
        return super.toString() + " Finally, its max flying speed is " + maxFlyingSpeed + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Quadcopter that = (Quadcopter) o;

        return maxFlyingSpeed == that.maxFlyingSpeed;
    }
}
