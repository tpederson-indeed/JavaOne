package com.company;

/*
    Write Two classes: Rectangle, Circle

    Give them instance variables and methods appropriate to calculating perimeter,
    area, and basic characters of the shape.

    Then, write class methods for each one that can print out the perimeter and area
    of any shape you give it.
 */

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5,15);
        Rectangle rectangle2 = new Rectangle(90,185);

        Circle circle1 = new Circle(25);
        Circle circle2 = new Circle(321);

        Triangle triangle1 = new Triangle(5,6,7);
        Triangle triangle2 = new Triangle(300,400,550);

        rectangle1.printStats(rectangle1);
        rectangle2.printStats(rectangle2);

        circle1.printStats(circle1);
        circle2.printStats(circle2);

        triangle1.printStats(triangle1);
        triangle2.printStats(triangle2);
    }
}
