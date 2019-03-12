package com.company;

public class Person extends Animal {
    private String jobTitle;

    private Person(){
        this.jobTitle = "Hobo";
    }

    public Person(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
