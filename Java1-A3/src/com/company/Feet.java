package com.company;

public class Feet extends ModeOfTransport {
    private int numberOfBlisters;

    public Feet() {
        this.setBaseSpeed(1);
        this.setNumberOfBlisters(0);
    }

    @Override
    protected void goPrint(int distance) {
        this.numberOfBlisters++;
        System.out.println(
                "Tromp tromp tromp, you hoof it " + distance + " units of distance, " +
                        "and have gone " + this.getDistanceTraveled() + " distance units. " +
                        "You how have " + this.getNumberOfBlisters() + " blisters."
        );
    }

    public int getNumberOfBlisters() {
        return numberOfBlisters;
    }

    public void setNumberOfBlisters(int numberOfBlisters) {
        this.numberOfBlisters = numberOfBlisters;
    }
}
