package org.example.model;

public class Stock extends Asset {
    private double dividend;

    public Stock(String name, double dividend) {
        super(name);
        this.dividend = dividend;
    }

    @Override
    public double calculateReturn() {
        return dividend * 1.1;
    }

    public double getDividend() {
        return dividend;
    }
}
