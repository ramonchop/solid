package com.ramon.solid.p2.refactored;

import java.util.List;

public interface EmployeePersistence {

    List<Employee> findAll();

    void save(Employee employee);

}
