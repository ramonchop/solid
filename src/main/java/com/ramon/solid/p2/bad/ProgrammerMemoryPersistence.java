package com.ramon.solid.p2.bad;

import java.util.ArrayList;
import java.util.List;

public class ProgrammerMemoryPersistence {

    private List<Programmer> programmers;

    public ProgrammerMemoryPersistence(){
        programmers = new ArrayList<>();
    }

    List<Programmer> findAll(){
        return programmers;
    }

    public void save(Programmer programmer){
        programmers.add(programmer);
    }
}
