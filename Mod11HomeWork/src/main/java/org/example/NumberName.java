package org.example;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberName {
    static List<String> name = List.of(" Sasha",  "Dima", " Vova"," Dasha"," Misha ");

public static String Names(List<String> name) {
    return IntStream.range(0, name.size())
            .filter(i -> i % 2 == 0)
            .mapToObj(i -> (i + 1) + ". " + name.get(i))
            .collect(Collectors.joining(", "));
}


    public static void main(String[] args) {
        System.out.println(Names(name));

    }
}