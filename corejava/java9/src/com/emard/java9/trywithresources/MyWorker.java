package com.emard.java9.trywithresources;

public class MyWorker implements AutoCloseable{
    MyWorker(){
        System.out.println("Creating the reource");
    }
    public void doSomething(){
        System.out.println("Do something");
    }
    @Override
    public void close() throws Exception {
        System.out.println("Closing the resource");
    }
}
