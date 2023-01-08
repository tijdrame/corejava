package com.emard.java12;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {
    public static void main(String[] args) {
        NumberFormat format = NumberFormat.getCompactNumberInstance();
        System.out.println(format.format(1000));//1 k
        format = NumberFormat.getCompactNumberInstance(Locale.CANADA, NumberFormat.Style.LONG);
        System.out.println(format.format(1000));//short 1k, long 1 thousand(millier pour fr)
    }
}
