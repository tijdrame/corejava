package com.emard.java12;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeeingDemo {
    public static void main(String[] args) {

        Result result = Stream.of(5,10,8,20,7, 35).collect(Collectors.teeing(
                Collectors.counting(),
                Collectors.filtering(n->n > 10,//Integer.parseInt(n.toString())>10
                        Collectors.toList()),
                Result::new));
        System.out.println(result);//Result{count=6, filtered=[20, 35]}
    }
}
