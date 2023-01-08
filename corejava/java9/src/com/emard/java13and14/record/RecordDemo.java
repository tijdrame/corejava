package com.emard.java13and14.record;

public class RecordDemo {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 125000);
        System.out.println(emp);
        System.out.println(emp.name());//<=> getName
    }
}
