package com.company;

public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getPerimeter() {
        return this.sideA + this.sideB + this.sideC;
    }

    public double getSemiperimeter() {
        return this.getPerimeter() / 2;
    }

    @Override
    public double getArea() {
        double s = this.getSemiperimeter();
        return Math.sqrt((s * (s - this.sideA) * (s - this.sideB) * (s - this.sideC)));
    }

    //** Standard Getters/Setters **

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public static void printStats(Triangle triangle) {
        System.out.println("Triangle SideA: " + Double.toString(triangle.getSideA()));
        System.out.println("Triangle SideB: " + Double.toString(triangle.getSideB()));
        System.out.println("Triangle SideC: " + Double.toString(triangle.getSideC()));
        System.out.println("Triangle Area: " + Double.toString(triangle.getArea()));
        System.out.println("Triangle Perimeter: " + Double.toString(triangle.getPerimeter()));
        System.out.println();
    }
}
