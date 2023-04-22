package org.example;

import java.util.*;

public class SortName {
    static List<String> names = Arrays.asList("Sasha ", "Dima ", "Vova ","Dasha","Misha");


    public static StringBuilder sortNames(List<String> names) {
        StringBuilder result = new StringBuilder();
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }
        });

        for (String string : names) {
            result.append(string.toUpperCase()).append("\n");
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println((sortNames(names)));
    }

}
