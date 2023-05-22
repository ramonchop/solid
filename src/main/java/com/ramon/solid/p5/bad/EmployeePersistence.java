package com.ramon.solid.p5.bad;

import java.util.List;

public interface EmployeePersistence {

    List<Employee> findAll();

    void save(Employee employee);

}
