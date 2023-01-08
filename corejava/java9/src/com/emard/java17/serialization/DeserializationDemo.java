package com.emard.java17.serialization;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputFilter;
import java.io.ObjectInputStream;

public class DeserializationDemo {


    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream
                ("C:\\Users\\tidiane\\OneDrive - Alithya\\Documents\\Emp.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ObjectInputFilter filter1 = ObjectInputFilter.Config.createFilter
                ("com.emard.java17.serialization.*;java.base/*;!*");

        //ObjectInputFilter.merge()
        ObjectInputFilter filter2 = ObjectInputFilter.allowFilter(
                cl -> cl.equals(Employee.class), ObjectInputFilter.Status.REJECTED);
        ois.setObjectInputFilter(filter2);
        Object obj = ois.readObject();
        Employee emp = (Employee) obj;
        System.out.println("Employee Id: " + emp.id);
        System.out.println("Employee Name: " + emp.name);
        System.out.println("Employee Salary: " + emp.salary);
        System.out.println("Employee SSN: " + emp.ssn);
        int i = 10;


    }

}