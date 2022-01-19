package com.kodilla.good.patterns.challenges.Airline;

import java.util.HashSet;

public interface SearchService {
    boolean search(HashSet<Connection> connectionsList, FlightRequest flightRequest);
}
