package com.ramon.solid.p3.bad;

public class Dolphin extends Mammal{
    public Dolphin(Integer weight, Integer ageInDays) {
        super(weight, ageInDays);
    }

    @Override
    public void walk() {
        throw new CannotWalkException("I'm cannot walk");
    }
}
