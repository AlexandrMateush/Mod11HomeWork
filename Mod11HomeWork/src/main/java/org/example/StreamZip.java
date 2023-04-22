package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamZip {
    public static Stream<String> zip (Stream<String> first, Stream<String> second){
        List<String> res =new ArrayList<>();
        Iterator<String> iteratorA = first.iterator();
        Iterator<String> iteratorB = second.iterator();

        while (iteratorA.hasNext() && iteratorB.hasNext()){
            res.add(iteratorA.next());
            res.add(iteratorB.next());
        }
        return res.stream();
    }
    public static void main(String[] args) {
        Stream<String> names = Stream.of("Pershy", "Drygi", "Treti","Pasha ", "Sasha", "Vova");
        Stream<String> indexes = Stream.of("1","2","3","4","5");



        zip(names,indexes).peek(System.out::println).collect(Collectors.toSet());


    }




}
