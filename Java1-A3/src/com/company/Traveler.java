package com.company;

public class Traveler {
    private ModeOfTransport wayToGoPlaces;
    private int distanceTraveled;

    public Traveler() {
        this.wayToGoPlaces = new Feet();
        this.distanceTraveled = 0;
    }

    public Traveler(ModeOfTransport wayToGoPlaces) {
        this.wayToGoPlaces = wayToGoPlaces;
    }

    public void goPlaces() {
        this.wayToGoPlaces.go();
        this.distanceTraveled = this.distanceTraveled + wayToGoPlaces.getBaseSpeed();
        System.out.println("Bob has gone " + this.distanceTraveled + " total distance units");
        System.out.println();
    }

    public void getNewWhip(Vehicle vehicle) {
        this.wayToGoPlaces = vehicle;
        if (vehicle instanceof Jalopy) {
            System.out.println("Aww..  You got a crappy " + this.wayToGoPlaces.getName() + "...");
        } else {
            System.out.println("Yo! You got a sweet new " + this.wayToGoPlaces.getName() + "!!!");
        }
    }
}
