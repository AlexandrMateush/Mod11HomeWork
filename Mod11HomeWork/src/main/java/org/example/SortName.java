package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class SortName {
    static List<String> names = Arrays.asList("Sasha ", "Dima ", "Vova ","Dasha","Misha");
    public static StringBuilder sortNames(List<String> names) {
        return new StringBuilder(String.valueOf(names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining("\n"))));

    }

    public static void main(String[] args) {
        System.out.println((sortNames(names)));
    }

}
