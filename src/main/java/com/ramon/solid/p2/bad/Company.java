package com.ramon.solid.p2.bad;

import java.util.List;

public class Company {
    private final ProgrammerMemoryPersistence persistence;

    public Company(){
        persistence = new ProgrammerMemoryPersistence();
    }

    public List<Programmer> getProgrammers(){
        return persistence.findAll();
    }

    public void addProgrammer(String name, int salary){
        persistence.save(new Programmer(name, salary));
    }
}
