package com.emard.java16.proxy;

public interface Worker {
    default String work(){
        return "Done";
    }
}
