package com.kodilla.good.patterns.challenges.Airline;

import java.util.HashSet;

public class Application {
    public static void main(String[] args) {
        FlightRequestRetriever flightRequestRetriever = new FlightRequestRetriever();
        FlightRequest flightRequest = flightRequestRetriever.retrieve();

        HashSet<Connection> connectionsList = flightRequestRetriever.retrieveConn();

        SearchProcessor searchProcessor = new SearchProcessor(new SearchFlight());
        searchProcessor.process(connectionsList, flightRequest);
    }
}
