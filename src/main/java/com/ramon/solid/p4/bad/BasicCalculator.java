package com.ramon.solid.p4.bad;

public class BasicCalculator implements Operations{
    @Override
    public Double add(double a, double b) {
        return a + b;
    }

    @Override
    public Double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public Double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public Double divide(double a, double b) {
        return a / b;
    }

    @Override
    public Double sine(double angle) {
        throw new UnsupportedOperationException("Sine is no supported");
    }

    @Override
    public Double cosine(double angle) {
        throw new UnsupportedOperationException("Cosine is no supported");
    }
}
