package com.ramon.solid.p5.refactored.persitence;


import com.ramon.solid.p5.refactored.Employee;

import java.util.List;

public class EmployeeOraclePersistence implements EmployeePersistence {

    public EmployeeOraclePersistence(String user, String password, String url){
        // create connection
    }

    @Override
    public List<Employee> findAll() {
        // from DB
        return null;
    }

    @Override
    public void save(Employee employee) {
        // save to DB
    }
}
