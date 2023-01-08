package com.emard.java13and14.record;

public record Employee(String name, int sal) {
    //props sont finaux, av get, toString, hashcode, equals
    public Employee(){//constructeur sans arg
        this("", 0);
    }
}
