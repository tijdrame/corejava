package com.emard.java16.datetime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
    public static void main(String[] args) {
        LocalTime time = LocalTime.parse("11:30:09.123456");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:m B");
        System.out.println(formatter.format(time));//11:30 du matin
    }
}
