package com.ramon.solid.p3.refactored;

public class Mammal {

    private Integer weight;
    private Integer ageInDays;

    public Mammal(Integer weight, Integer ageInDays) {
        this.weight = weight;
        this.ageInDays = ageInDays;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getAgeInDays() {
        return ageInDays;
    }

    public void setAgeInDays(Integer ageInDays) {
        this.ageInDays = ageInDays;
    }

}
