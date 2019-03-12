package com.company;

/*
    Make a person.
    Give the person some useful instance variables for its state.
    Provide a constructor (or constructors) for that person.
    And, give that a person a cat, named "Mittens"
 */

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Person McPersonface");

        Cat cat1 = new Cat("Cat-Man-Do-Do", "Pea Soup Green");
        Cat cat2 = new Cat("Mittens", "Calico");

        System.out.println(cat1.name + " is owned by " + cat1.getOwnerName());
        cat1.adopt(person1.name);
        System.out.println(cat1.name + " is owned by " + cat1.getOwnerName());

        System.out.println(cat2.name + " is owned by " + cat2.getOwnerName());
        cat2.adopt(person1.name);
        System.out.println(cat2.name + " is owned by " + cat2.getOwnerName());

        person1.feed();
        cat1.feed();
        cat2.feed();
    }
}
