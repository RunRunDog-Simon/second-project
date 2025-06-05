package org.example.model;

public class Bond extends Asset {
    private double interestRate;

    public Bond(String name, double interestRate) {
        super(name);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateReturn() {
        return interestRate * 1.05;
    }

    public double getInterestRate() {
        return interestRate;
    }
}
