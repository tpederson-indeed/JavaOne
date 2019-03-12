package com.company;

public class ModeOfTransport {
    private int baseSpeed;
    private int distanceTraveled;
    private String name;

    public ModeOfTransport() {
        this.baseSpeed = 0;
        this.distanceTraveled = 0;
    }

    public void go() {
        this.distanceTraveled += this.baseSpeed;
        goPrint(this.baseSpeed);
    }

    public void go(int distance) {
        this.distanceTraveled += distance;
        goPrint(distance);
    }

    protected void goPrint(int distance) {
        System.out.println(
                "Zoom zoom, this vehicle travels " + distance + " units of distance, " +
                        "and has gone " + this.distanceTraveled + " distance units."
        );
    }

    public int getBaseSpeed() {
        return baseSpeed;
    }

    public void setBaseSpeed(int baseSpeed) {
        this.baseSpeed = baseSpeed;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
