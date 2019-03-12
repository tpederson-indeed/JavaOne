package javaonefinal.invoicestuff;

import javaonefinal.people.*;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    public static double SALES_TAX_RATE = 0.0825;

    private Person customer;
    private Employee employee;
    private List<LineItem> lineItems;
    private double grossAmt;
    private double taxAmt;
    private double totalAmt;
    private double commissionAmt;

    public Invoice(Person customer, Employee employee) {
        this.customer = customer;
        this.employee = employee;
        lineItems = new ArrayList<LineItem>();

        this.grossAmt = 0;
        this.taxAmt = 0;
        this.totalAmt = 0;
        this.commissionAmt = 0;
    }

    public void addLineItem(LineItem lineItem) {
        lineItems.add(lineItem);
        double grossLineAmt = lineItem.getPrice() * lineItem.getQty();
        this.grossAmt += grossLineAmt;
        this.taxAmt = this.grossAmt * Invoice.SALES_TAX_RATE;
        this.totalAmt = this.grossAmt + this.taxAmt;
        if (this.employee instanceof CommissionEmployee) {
            double lineCommissionAmt = grossLineAmt * ((CommissionEmployee) this.employee).getCommission();
            this.commissionAmt = this.grossAmt * ((CommissionEmployee) this.employee).getCommission();
            ((CommissionEmployee) this.employee).addCommission(lineCommissionAmt);
        }
    }

    public void print() {
        System.out.printf("Customer: %s", this.getCustomer().getName());
        System.out.printf("\nEmployee: %s\tID: %s", this.getEmployee().getName(), this.getEmployee().getId());
        System.out.print("\n\nLine Items:");
        System.out.print("\n-----------");
        for (LineItem lineItem : lineItems) {
            System.out.printf("\n%d: %s", lineItem.getId(), lineItem.getName());
            System.out.printf("\nQty: %d", lineItem.getQty());
            System.out.printf("\nPrice Per: %.2f\n", lineItem.getPrice());
        }
        System.out.print("\n-----------");
        System.out.printf("\nPre-Tax: %.2f", this.getGrossAmt());
        System.out.printf("\nTax: %.2f", this.getTaxAmt());
        System.out.printf("\nTotal Due: %.2f\n", this.getTotalAmt());
        if (this.employee instanceof CommissionEmployee) {
            System.out.printf("\n\nCommission Earned: %.2f", this.getCommissionAmt());
        }
    }

    /* Standard Getters and Setters */

    public Person getCustomer() {
        return customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public double getGrossAmt() {
        return grossAmt;
    }

    public double getTaxAmt() {
        return taxAmt;
    }

    public double getTotalAmt() {
        return totalAmt;
    }

    public double getCommissionAmt() {
        return commissionAmt;
    }
}
