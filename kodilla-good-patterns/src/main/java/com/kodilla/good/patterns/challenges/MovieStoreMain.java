package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.stream.Collectors;

public class MovieStoreMain {
    public static void main(String[] args) {
        MovieStore store = new MovieStore();

        List<String> theResultOfMovieStore = store.getMovies().entrySet().stream()
                .flatMap(book -> book.getValue().stream())
                .collect(Collectors.toList());

        theResultOfMovieStore.stream()
                .map(entry -> entry + "!")
                .forEach(System.out::print);
    }
}
