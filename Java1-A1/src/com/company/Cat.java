package com.company;

public class Cat extends Animal {
    private String color;
    private String ownerName;

    private Cat(){
        this.color = "Unknown";
        this.ownerName = "Nobody";
    }

    public Cat(String name, String color) {
        this();
        this.name = name;
        this.color = color;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getColor() {
        return color;
    }

    public void adopt(String ownerName) {
        this.ownerName = ownerName;
        System.out.println(this.name + " has been adopted by " + this.ownerName);
    }

}
