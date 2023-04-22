package org.example;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Random {

    public Stream<Long> next(long seed, long a, long c, long m){

        return Stream.iterate(seed, n -> ((a * n) + c) % m);

    }

    public static void main(String[] args) {
        Random random = new Random();
        Stream<Long> intStream = random.next(0L, 25214903917L,11,2^48);

        Set<Long> collect = intStream.limit(20)
                .peek(System.out::println)
                .collect(Collectors.toSet());



    }





}
