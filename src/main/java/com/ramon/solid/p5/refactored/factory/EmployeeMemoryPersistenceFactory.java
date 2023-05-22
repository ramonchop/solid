package com.ramon.solid.p5.refactored.factory;

import com.ramon.solid.p5.refactored.persitence.EmployeeMemoryPersistence;
import com.ramon.solid.p5.refactored.persitence.EmployeePersistence;

public class EmployeeMemoryPersistenceFactory implements EmployeePersistenceFactory{
    @Override
    public EmployeePersistence getEmployeePersistence() {
        return new EmployeeMemoryPersistence();
    }
}
