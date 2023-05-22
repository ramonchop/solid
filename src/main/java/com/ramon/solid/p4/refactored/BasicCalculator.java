package com.ramon.solid.p4.refactored;

public class BasicCalculator implements BasicOperations {
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

}
