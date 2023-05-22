package com.ramon.solid.p2.refactored;

import java.util.ArrayList;
import java.util.List;


public class EmployeeMemoryPersistence implements EmployeePersistence {

    private final List<Employee> employees;

    public EmployeeMemoryPersistence(){
        employees = new ArrayList<>();
    }

    public List<Employee> findAll(){
        return employees;
    }

    public void save(Employee employee){
        employees.add(employee);
    }
}
