package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Array {
    static String[] array = new String[]{"1,2,0","4,5","10,45,55"};
    public static String arraySort(String[] array) {
        return Arrays.stream(array)
                .flatMap(s -> Arrays.stream(s.split(",\\s*")))
                .map(Integer::parseInt)
                .sorted()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        System.out.println((arraySort(array)));
    }
}
