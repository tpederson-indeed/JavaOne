package com.company;

public class Bicycle extends Vehicle {

    public Bicycle() {
        this.setBaseSpeed(2);
        this.setNumTires(2);
        this.setName("Huffy");
    }

    @Override
    protected void goPrint(int distance) {
        System.out.println(
                "Ding ding! You pedal " + distance + " units of distance, " +
                        "and have gone " + this.getDistanceTraveled() + " distance units. "
        );
    }

}
