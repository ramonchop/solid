package com.ramon.solid.p5.refactored.factory;

import com.ramon.solid.p5.refactored.persitence.EmployeePersistence;

public interface EmployeePersistenceFactory {

    EmployeePersistence getEmployeePersistence();

}
