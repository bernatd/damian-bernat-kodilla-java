package com.kodilla.stream.array;

import java.util.stream.IntStream;

public final class Array implements ArrayOperations {

    public double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .mapToObj(Integer::toString)
                .map(n -> n + ", ")
                .forEach(System.out::print);
        System.out.println();

        double avg = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average().getAsDouble();
        return avg;
    }
}
