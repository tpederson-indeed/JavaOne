package com.company;

public class Circle extends Shape {
    private double diameter;

    public Circle(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getRadius() {
        return (this.getDiameter() / 2.0);
    }

    @Override
    public double getArea() {
        return (Math.pow(this.getRadius(), 2.0) * Math.PI);
    }

    @Override
    public double getPerimeter() {
        return (Math.PI * this.getDiameter());
    }

    public static void printStats(Circle circle) {
        System.out.println("Circle Diameter: " + Double.toString(circle.getDiameter()));
        System.out.println("Circle Radius: " + Double.toString(circle.getRadius()));
        System.out.println("Circle Circumference: " + Double.toString(circle.getPerimeter()));
        System.out.println("Circle Area: " + Double.toString(circle.getArea()));
        System.out.println();
    }
}
