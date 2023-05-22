package com.ramon.solid.p2.refactored;

import java.util.List;

public class Company {
    private final EmployeePersistence persistence;

    public Company(){
        persistence = new EmployeeMemoryPersistence();
    }

    public List<Employee> getProgrammers(){
        return persistence.findAll();
    }

    public void addEmployee(Employee employee){
        persistence.save(employee);
    }
}
