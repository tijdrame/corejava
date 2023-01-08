package com.emard.java16.stream;

import java.util.Arrays;

public class StreamToListDemo {
    public static void main(String[] args) {
        var ids = Arrays.asList("123","456","789");
        ids.stream().map(Integer::parseInt).toList().forEach(System.out::println);
    }
}
