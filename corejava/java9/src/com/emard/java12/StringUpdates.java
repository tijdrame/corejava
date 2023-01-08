package com.emard.java12;

public class StringUpdates {
    public static void main(String[] args) {
        var s = "All the power is with you. You can do anything and everything!!";
        System.out.println(s);
        System.out.println(s.indent(5));
        String s2 = "10";
        Integer r = s2.transform(Integer::parseInt);
        System.out.println(r);
    }
}
