package com.ramon.solid.p5.refactored.factory;

import com.ramon.solid.p5.refactored.persitence.EmployeeOraclePersistence;
import com.ramon.solid.p5.refactored.persitence.EmployeePersistence;

public class EmployeeOraclePersistenceFactory implements EmployeePersistenceFactory{
    @Override
    public EmployeePersistence getEmployeePersistence() {
        return new EmployeeOraclePersistence("user", "pass", "url");
    }
}
