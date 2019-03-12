package javaonefinal.people;

public class CommissionEmployee extends Employee {
    public static final double STARTING_RATE = 2.5;
    public static final double STARTING_COMMISSION = 0.1;

    private static double TOTAL_COMMISSION_EARNED = 0;

    private double baseRate;
    private double commission;
    private double totalCommission;

    public CommissionEmployee(int id, int active, String name, int age) {
        super(id, active, name, age);
        this.baseRate = STARTING_RATE;
        this.commission = STARTING_COMMISSION;
        this.totalCommission = 0;
    }

    public CommissionEmployee(double baseRate, double commission, int id, int active, String name, int age) {
        this(id, active, name, age);
        this.baseRate = baseRate;
        this.commission = commission;
    }

    public static double getAllEmployeesTotalCommission(){
        return CommissionEmployee.TOTAL_COMMISSION_EARNED;
    }

    public void addCommission(double commissionAmt) {
        this.totalCommission += commissionAmt;
        CommissionEmployee.TOTAL_COMMISSION_EARNED += commissionAmt;
    }

    @Override
    public String toString() {
        String output = super.toString();
        output += String.format("\nBase Rate: %.1f", this.getBaseRate());
        output += String.format("\nCommission: %.2f", this.getCommission());
        return output;
    }

    /* Standard Getters and Setters */

    public double getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(double baseRate) {
        this.baseRate = baseRate;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public double getTotalCommission() {
        return totalCommission;
    }
}
