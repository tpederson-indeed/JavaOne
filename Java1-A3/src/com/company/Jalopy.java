package com.company;

public class Jalopy extends Car {

    public Jalopy() {
        this.setBaseSpeed(0);
        this.setName("AMC Gremlin");
    }

    @Override
    protected void goPrint(int distance) {
        System.out.println(
                "The POS " + this.getName() + " starts on fire.  You go nowhere."
        );
    }
}
