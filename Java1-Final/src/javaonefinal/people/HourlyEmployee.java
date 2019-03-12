package javaonefinal.people;

public class HourlyEmployee extends Employee {
    public static double STARTING_HOURLY_RATE = 10.75;

    private double hourlyRate;

    public HourlyEmployee(int id, int active, String name, int age) {
        super(id, active, name, age);
        this.hourlyRate = this.STARTING_HOURLY_RATE;
    }

    public HourlyEmployee(double hourlyRate, int id, int active, String name, int age) {
        this(id, active, name, age);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String toString() {
        String output = super.toString();
        output += String.format("\nHourly Rate: %.2f", this.getHourlyRate());
        return output;
    }

    /* Standard Getters and Setters */

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
