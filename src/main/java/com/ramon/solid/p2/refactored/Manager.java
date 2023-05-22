package com.ramon.solid.p2.refactored;

public class Manager extends Employee{

    private final Integer bonus;
    public Manager(String fullName, Integer salary, Integer bonus) {
        super(fullName, salary);
        this.bonus = bonus;
    }

    public Integer getBonus() {
        return bonus;
    }

}
