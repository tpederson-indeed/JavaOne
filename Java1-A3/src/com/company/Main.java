package com.company;

public class Main {
    /*
        Create some classes and have them have meaning

        ModeOfTransportation
            go()
            distanceTraveled
            baseSpeed
                Feet
                Bicycle
                    numOfTires
                Car
                    numOfTires
     */
    public static void main(String[] args) {
        Traveler bob = new Traveler();
        bob.goPlaces();
        bob.goPlaces();

        Jalopy jalopy = new Jalopy();
        bob.getNewWhip(jalopy);
        bob.goPlaces();

        Bicycle bike = new Bicycle();
        bob.getNewWhip(bike);
        bob.goPlaces();
        bob.goPlaces();

        FancySportsCar sportySpice = new FancySportsCar();
        bob.getNewWhip(sportySpice);
        bob.goPlaces();
        bob.goPlaces();
        bob.goPlaces();
    }
}
