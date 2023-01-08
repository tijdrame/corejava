package com.emard.java11;

import java.util.stream.Collectors;

public class StringUpdates {
    public static void main(String[] args) {
        String str = "          ";
        System.out.println(str.isBlank());
        str = "I \n am \n the \n creator \n of my destiny";
        System.out.println(str.lines().collect(Collectors.toList()));
        char c = '\u2000';
        str += c;
        System.out.println(str.strip());
        System.out.println("(-v-)".repeat(100));
    }
}
