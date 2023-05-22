package com.ramon.solid.p3.refactored;

public class LandMammal extends Mammal{
    public LandMammal(Integer weight, Integer ageInDays) {
        super(weight, ageInDays);
    }

    public void walk(){
        System.out.println("I'm Walking");
    }
}
