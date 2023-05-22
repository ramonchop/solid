package com.ramon.solid.p2.refactored;

public class Employee {
    private String fullName;
    private Integer salary;

    public Employee(String fullName, Integer salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
