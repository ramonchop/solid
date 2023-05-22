package com.ramon.solid.p4.bad;

public class AdvancedCalculator implements Operations{
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
        return Math.sin(angle);
    }

    @Override
    public Double cosine(double angle) {
        return Math.cos(angle);
    }
}
