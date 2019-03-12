package javaonefinal.people;

public class Employee extends Person {
    private int id;
    private int active;

    public Employee(int id, int active, String name, int age) {
        super(name, age);
        this.id = id;
        this.active = active;
    }

    @Override
    public String toString() {
        String output = super.toString();
        output += String.format("\nEmployee ID: %d", this.getId());
        return output;
    }

    public int getId() {
        return this.id;
    }

    public int getActive() {
        return this.active;
    }

    public void setActive(int active) {
        this.active = active;
    }
}
