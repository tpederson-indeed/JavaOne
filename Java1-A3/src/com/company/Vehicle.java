package com.company;

public class Vehicle extends ModeOfTransport {
    private int numTires;

    public Vehicle() {
        this.numTires = 0;
    }

    public int getNumTires() {
        return numTires;
    }

    public void setNumTires(int numTires) {
        this.numTires = numTires;
    }
}
