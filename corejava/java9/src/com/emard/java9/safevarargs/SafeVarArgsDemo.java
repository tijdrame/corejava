package com.emard.java9.safevarargs;

import java.util.Arrays;
import java.util.List;

public class SafeVarArgsDemo {
    public static void main(String[] args) {
        List<String> l1 = Arrays.asList("abc", "xyz");
        List<String> l2 = Arrays.asList("nyc", "lon");
        SafeVarArgsDemo.myMethod(l1, l2);
    }

    @SafeVarargs
    public static void myMethod(List<String>...l){
        String name = (String) l[0].get(0);
        System.out.println(name);
    }
}
