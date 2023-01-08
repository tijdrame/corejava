package com.emard.java9.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,40,7,18,23,30);
        //list.stream().filter(x->x%5==0).forEach(System.out::println);
        System.out.println("take wile");
        list.stream().takeWhile(x->x%5==0).forEach(System.out::println);
        System.out.println("drop wile");
        list.stream().dropWhile(x->x%5==0).forEach(System.out::println);
        System.out.println("ofNullable");
        list.stream().flatMap(x-> Stream.ofNullable(x)).forEach(System.out::println);
        List<Integer> newList = list.stream().filter(x -> x % 5 == 0).toList();
        newList.add(5);
    }
}
