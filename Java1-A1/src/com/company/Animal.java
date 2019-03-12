package com.company;

public class Animal {
    public String name;
    public int height;
    public int weight;
    public int energy;
    public int fullness;

    public Animal() {
        this.name = "Nobody";
        this.height = 0;
        this.weight = 0;
        this.energy = 0;
        this.fullness = 0;
    }

    public void feed() {
        this.fullness++;
        System.out.println(this.name + ": Om nom nom..");
    }
}
