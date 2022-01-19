package com.kodilla.good.patterns.challenges.Airline;


import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class SearchFlight implements SearchService{
    @Override
    public boolean search(HashSet<Connection> connectionsList, FlightRequest flightRequest) {
        if (flightRequest.getConnection().getDestination() == null) {
            connectionsList.stream()
                .filter(c -> c.getOrigin().equals(flightRequest.getConnection().getOrigin()))
                .forEach(System.out::println);
        } else if (flightRequest.getConnection().getOrigin() == null) {
            connectionsList.stream()
                    .filter(c -> c.getDestination().equals(flightRequest.getConnection().getDestination()))
                    .forEach(System.out::println);
        } else {
            connectionsList.stream()
                    .filter(c -> c.equals(flightRequest.getConnection()))
                    .forEach(System.out::println);

            List<Connection> list = connectionsList.stream()
                    .filter(c -> c.getOrigin().equals(flightRequest.getConnection().getOrigin()))
                    .collect(Collectors.toList());
            List<Connection> list2 = connectionsList.stream()
                    .filter(c -> c.getDestination().equals(flightRequest.getConnection().getDestination()))
                    .collect(Collectors.toList());

            for (Connection c : list) {
                for (Connection c2 : list2) {
                    if (c.getDestination().equals(c2.getOrigin())) {
                        System.out.println(c + " -> " + c2);
                    }
                }
            }
        }
        return true;
    }
}

