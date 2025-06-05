package org.example.model;

public class Crypto extends Asset {
    private double volatility;

    public Crypto(String name, double volatility) {
        super(name);
        this.volatility = volatility;
    }

    @Override
    public double calculateReturn() {
        return volatility * 1.3;
    }

    public double getVolatility() {
        return volatility;
    }
}
