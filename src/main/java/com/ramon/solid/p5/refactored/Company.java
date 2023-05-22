package com.ramon.solid.p5.refactored;

import com.ramon.solid.p5.refactored.factory.EmployeePersistenceFactory;
import com.ramon.solid.p5.refactored.persitence.EmployeeMemoryPersistence;
import com.ramon.solid.p5.refactored.persitence.EmployeePersistence;

import java.util.List;

public class Company {
    private final EmployeePersistence persistence;

    public Company(EmployeePersistenceFactory factory){
        persistence = factory.getEmployeePersistence();
    }

    public List<Employee> getProgrammers(){
        return persistence.findAll();
    }

    public void addEmployee(Employee employee){
        persistence.save(employee);
    }
}
