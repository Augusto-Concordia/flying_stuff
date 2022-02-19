package com.amp.flyingstuff.multi;

import com.amp.flyingstuff.copters.Helicopter;

public class Multirotor extends Helicopter {
    private int numberOfRotors;

    /* CONSTRUCTORS */

    public Multirotor()
    {
        super();
        this.numberOfRotors = 5;
    }

    public Multirotor(Multirotor multirotor)
    {
        super(multirotor);
        this.numberOfRotors = multirotor.numberOfRotors;
    }

    public Multirotor(String brand, double price, int horsepower, int numberOfCylinders, int creationYear, int passengerCapacity, int numberOfRotors) {
        super(brand, price, horsepower, numberOfCylinders, creationYear, passengerCapacity);
        this.numberOfRotors = numberOfRotors;
    }

    /* ACCESSORS & MUTATORS */

    public int getNumberOfRotors() {
        return numberOfRotors;
    }

    public void setNumberOfRotors(int numberOfRotors) {
        this.numberOfRotors = numberOfRotors;
    }

    /* OVERRIDES */

    @Override
    public String toString() {
        return super.toString() + " Finally, it has " + numberOfRotors + " rotors.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Multirotor multirotor = (Multirotor) o;

        return numberOfRotors == multirotor.numberOfRotors;
    }
}
