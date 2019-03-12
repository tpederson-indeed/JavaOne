package com.company;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return (this.getHeight() * this.getWidth());
    }

    @Override
    public double getPerimeter() {
        return (2 * (this.getHeight() + this.getWidth()));
    }

    public static void printStats(Rectangle square) {
        System.out.println("Rectangle Height: " + Double.toString(square.getHeight()));
        System.out.println("Rectangle Width: " + Double.toString(square.getWidth()));
        System.out.println("Rectangle Area: " + Double.toString(square.getArea()));
        System.out.println("Rectangle Perimeter: " + Double.toString(square.getPerimeter()));
        System.out.println();
    }
}
