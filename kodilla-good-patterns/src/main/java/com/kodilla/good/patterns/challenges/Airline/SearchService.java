package com.kodilla.good.patterns.challenges.Airline;

import java.util.HashSet;

public interface SearchService {
    boolean searchFrom(HashSet<Connection> connectionsList, FlightRequest flightRequest);
    boolean searchTo(HashSet<Connection> connectionsList, FlightRequest flightRequest);
    boolean searchConnection(HashSet<Connection> connectionsList, FlightRequest flightRequest);
}
