package com.ramon.solid.p5.refactored.persitence;

import com.ramon.solid.p5.refactored.Employee;

import java.util.List;

public interface EmployeePersistence {

    List<Employee> findAll();

    void save(Employee employee);

}
